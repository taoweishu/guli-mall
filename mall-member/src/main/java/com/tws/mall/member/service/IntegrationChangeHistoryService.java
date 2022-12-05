package com.tws.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tws.mall.utils.PageUtils;
import com.tws.mall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author tws
 * @email taoweishu2000@163.com
 * @date 2022-12-05 21:54:51
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

