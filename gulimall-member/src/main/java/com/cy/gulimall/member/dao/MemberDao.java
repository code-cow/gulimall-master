package com.cy.gulimall.memeber.dao;

import com.cy.gulimall.memeber.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-09-04 20:56:42
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
