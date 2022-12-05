package com.tws.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tws.mall.product.entity.SkuSaleAttrValueEntity;
import com.tws.mall.utils.PageUtils;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author tws
 * @email taoweishu2000@163.com
 * @date 2022-12-05 17:30:43
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

