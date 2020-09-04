package com.cy.gulimall.product.dao;

import com.cy.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-09-04 20:52:37
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
