package com.tws.mall.order.dao;

import com.tws.mall.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author tws
 * @email taoweishu2000@163.com
 * @date 2022-12-05 21:53:38
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
