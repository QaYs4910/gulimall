package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ÓÅ»ÝÈ¯ÁìÈ¡ÀúÊ·¼ÇÂ¼
 * 
 * @author wuyy
 * @email QaYs4910@163.com
 * @date 2025-02-25 19:27:12
 */
@Data
@TableName("sms_coupon_history")
public class CouponHistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ÓÅ»ÝÈ¯id
	 */
	private Long couponId;
	/**
	 * »áÔ±id
	 */
	private Long memberId;
	/**
	 * »áÔ±Ãû×Ö
	 */
	private String memberNickName;
	/**
	 * »ñÈ¡·½Ê½[0->ºóÌ¨ÔùËÍ£»1->Ö÷¶¯ÁìÈ¡]
	 */
	private Integer getType;
	/**
	 * ´´½¨Ê±¼ä
	 */
	private Date createTime;
	/**
	 * Ê¹ÓÃ×´Ì¬[0->Î´Ê¹ÓÃ£»1->ÒÑÊ¹ÓÃ£»2->ÒÑ¹ýÆÚ]
	 */
	private Integer useType;
	/**
	 * Ê¹ÓÃÊ±¼ä
	 */
	private Date useTime;
	/**
	 * ¶©µ¥id
	 */
	private Long orderId;
	/**
	 * ¶©µ¥ºÅ
	 */
	private Long orderSn;

}
