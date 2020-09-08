package com.cy.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cy.common.utils.PageUtils;
import com.cy.gulimall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-09-08 10:15:50
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

