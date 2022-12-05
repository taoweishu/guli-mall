package com.tws.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tws.mall.coupon.entity.CouponSpuCategoryRelationEntity;
import com.tws.mall.utils.PageUtils;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author tws
 * @email taoweishu2000@163.com
 * @date 2022-12-05 21:57:06
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

