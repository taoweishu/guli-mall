package com.tws.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tws.mall.coupon.entity.SkuLadderEntity;
import com.tws.mall.utils.PageUtils;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author tws
 * @email taoweishu2000@163.com
 * @date 2022-12-05 21:57:06
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

