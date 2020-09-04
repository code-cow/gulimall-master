package com.cy.gulimall.coupon.dao;

import com.cy.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-09-04 21:01:05
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
