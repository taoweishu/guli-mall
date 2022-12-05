package com.tws.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tws.mall.member.entity.GrowthChangeHistoryEntity;
import com.tws.mall.utils.PageUtils;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author tws
 * @email taoweishu2000@163.com
 * @date 2022-12-05 21:54:51
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

