package com.cy.gulimall.order.dao;

import com.cy.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-09-04 20:59:12
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
