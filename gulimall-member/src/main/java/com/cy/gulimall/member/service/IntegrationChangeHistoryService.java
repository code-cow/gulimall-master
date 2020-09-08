package com.cy.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cy.common.utils.PageUtils;
import com.cy.gulimall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-09-08 10:15:50
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

