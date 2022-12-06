package com.tws.mall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tws.mall.product.dao.CategoryDao;
import com.tws.mall.product.entity.CategoryEntity;
import com.tws.mall.product.service.CategoryService;
import com.tws.mall.utils.PageUtils;
import com.tws.mall.utils.Query;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service("categoryService")
@Slf4j
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {
    @Resource
    CategoryDao categoryDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page =
            this.page(new Query<CategoryEntity>().getPage(params), new QueryWrapper<CategoryEntity>());

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> categoryEntities = categoryDao.selectList(null);
        List<CategoryEntity> collect =
            categoryEntities.stream().filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                .map((menu) -> {
                    menu.setChildren(getChildren(menu, categoryEntities));
                    return menu;
                })
                .sorted(Comparator.comparing(CategoryEntity::getCatId))
                .collect(Collectors.toList());

        return collect;
    }

    private List<CategoryEntity> getChildren(CategoryEntity category, List<CategoryEntity> categoryEntities) {
        List<CategoryEntity> collect = categoryEntities.stream().filter(category1 -> {
            return category1.getParentCid().equals(category.getCatId());
        })
            .map((menu) -> {
                menu.setChildren(getChildren(menu, categoryEntities));
                return menu;
            })
            .sorted(Comparator.comparing(CategoryEntity::getCatId))
            .collect(Collectors.toList());

        return collect;
    }

}