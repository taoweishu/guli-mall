package com.tws.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tws.mall.utils.PageUtils;
import com.tws.mall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author tws
 * @email taoweishu2000@163.com
 * @date 2022-12-05 21:53:38
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

