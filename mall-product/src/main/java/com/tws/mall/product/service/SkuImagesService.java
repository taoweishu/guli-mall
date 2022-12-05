package com.tws.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tws.mall.product.entity.SkuImagesEntity;
import com.tws.mall.utils.PageUtils;

import java.util.Map;

/**
 * sku图片
 *
 * @author tws
 * @email taoweishu2000@163.com
 * @date 2022-12-05 17:30:43
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

