package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ÃëÉ±»î¶¯
 * 
 * @author wuyy
 * @email QaYs4910@163.com
 * @date 2025-02-25 19:27:12
 */
@Data
@TableName("sms_seckill_promotion")
public class SeckillPromotionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * »î¶¯±êÌâ
	 */
	private String title;
	/**
	 * ¿ªÊ¼ÈÕÆÚ
	 */
	private Date startTime;
	/**
	 * ½áÊøÈÕÆÚ
	 */
	private Date endTime;
	/**
	 * ÉÏÏÂÏß×´Ì¬
	 */
	private Integer status;
	/**
	 * ´´½¨Ê±¼ä
	 */
	private Date createTime;
	/**
	 * ´´½¨ÈË
	 */
	private Long userId;

}
