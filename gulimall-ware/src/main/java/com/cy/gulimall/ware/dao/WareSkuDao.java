package com.cy.gulimall.ware.dao;

import com.cy.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-09-04 21:02:46
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
