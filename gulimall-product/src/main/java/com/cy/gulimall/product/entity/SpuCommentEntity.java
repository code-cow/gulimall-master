package com.cy.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品评价
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-09-04 20:52:38
 */
@Data
@TableName("pms_spu_comment")
public class SpuCommentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Long id;
	/**
	 * $column.comments
	 */
	private Long skuId;
	/**
	 * $column.comments
	 */
	private Long spuId;
	/**
	 * $column.comments
	 */
	private String spuName;
	/**
	 * $column.comments
	 */
	private String memberNickName;
	/**
	 * $column.comments
	 */
	private Integer star;
	/**
	 * $column.comments
	 */
	private String memberIp;
	/**
	 * $column.comments
	 */
	private Date createTime;
	/**
	 * $column.comments
	 */
	private Integer showStatus;
	/**
	 * $column.comments
	 */
	private String spuAttributes;
	/**
	 * $column.comments
	 */
	private Integer likesCount;
	/**
	 * $column.comments
	 */
	private Integer replyCount;
	/**
	 * $column.comments
	 */
	private String resources;
	/**
	 * $column.comments
	 */
	private String content;
	/**
	 * $column.comments
	 */
	private String memberIcon;
	/**
	 * $column.comments
	 */
	private Integer commentType;

}
