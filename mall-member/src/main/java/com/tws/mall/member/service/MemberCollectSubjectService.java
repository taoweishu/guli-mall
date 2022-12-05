package com.tws.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tws.mall.utils.PageUtils;
import com.tws.mall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author tws
 * @email taoweishu2000@163.com
 * @date 2022-12-05 21:54:51
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

