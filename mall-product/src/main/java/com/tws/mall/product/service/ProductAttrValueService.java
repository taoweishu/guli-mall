package com.tws.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tws.mall.product.entity.ProductAttrValueEntity;
import com.tws.mall.utils.PageUtils;

import java.util.Map;

/**
 * spu属性值
 *
 * @author tws
 * @email taoweishu2000@163.com
 * @date 2022-12-05 17:30:42
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

