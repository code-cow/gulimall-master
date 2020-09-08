package com.cy.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cy.common.utils.PageUtils;
import com.cy.gulimall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-09-08 10:15:50
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

