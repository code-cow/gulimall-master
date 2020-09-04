package com.cy.gulimall.coupon.dao;

import com.cy.gulimall.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-09-04 21:01:05
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
