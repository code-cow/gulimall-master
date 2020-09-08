package com.cy.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cy.common.utils.PageUtils;
import com.cy.gulimall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-09-08 10:15:50
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

