package com.tws.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tws.mall.coupon.entity.CouponSpuRelationEntity;
import com.tws.mall.utils.PageUtils;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author tws
 * @email taoweishu2000@163.com
 * @date 2022-12-05 21:57:06
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

