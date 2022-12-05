package com.tws.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tws.mall.utils.PageUtils;
import com.tws.mall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author tws
 * @email taoweishu2000@163.com
 * @date 2022-12-05 21:55:57
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

