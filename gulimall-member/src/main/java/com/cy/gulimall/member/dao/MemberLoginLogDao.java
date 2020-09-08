package com.cy.gulimall.member.dao;

import com.cy.gulimall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-09-08 10:15:50
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
