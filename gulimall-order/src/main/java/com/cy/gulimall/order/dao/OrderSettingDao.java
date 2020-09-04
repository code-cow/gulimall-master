package com.cy.gulimall.order.dao;

import com.cy.gulimall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-09-04 20:59:12
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
