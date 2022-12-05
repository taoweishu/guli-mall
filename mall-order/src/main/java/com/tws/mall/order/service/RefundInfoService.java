package com.tws.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tws.mall.utils.PageUtils;
import com.tws.mall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author tws
 * @email taoweishu2000@163.com
 * @date 2022-12-05 21:53:38
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

