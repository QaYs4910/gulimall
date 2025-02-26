package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spuÐÅÏ¢
 * 
 * @author wuyy
 * @email QaYs4910@163.com
 * @date 2025-02-25 18:22:57
 */
@Data
@TableName("pms_spu_info")
public class SpuInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ÉÌÆ·id
	 */
	@TableId
	private Long id;
	/**
	 * ÉÌÆ·Ãû³Æ
	 */
	private String spuName;
	/**
	 * ÉÌÆ·ÃèÊö
	 */
	private String spuDescription;
	/**
	 * ËùÊô·ÖÀàid
	 */
	private Long catalogId;
	/**
	 * Æ·ÅÆid
	 */
	private Long brandId;
	/**
	 * 
	 */
	private BigDecimal weight;
	/**
	 * ÉÏ¼Ü×´Ì¬[0 - ÏÂ¼Ü£¬1 - ÉÏ¼Ü]
	 */
	private Integer publishStatus;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Date updateTime;

}
