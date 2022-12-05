package com.tws.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tws.mall.coupon.entity.HomeAdvEntity;
import com.tws.mall.utils.PageUtils;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author tws
 * @email taoweishu2000@163.com
 * @date 2022-12-05 21:57:06
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

