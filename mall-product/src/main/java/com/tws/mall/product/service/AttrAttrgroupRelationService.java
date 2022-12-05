package com.tws.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tws.mall.product.entity.AttrAttrgroupRelationEntity;
import com.tws.mall.utils.PageUtils;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author tws
 * @email taoweishu2000@163.com
 * @date 2022-12-05 17:30:43
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

