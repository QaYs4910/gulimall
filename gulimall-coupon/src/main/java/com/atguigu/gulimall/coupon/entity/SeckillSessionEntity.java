package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ÃëÉ±»î¶¯³¡´Î
 * 
 * @author wuyy
 * @email QaYs4910@163.com
 * @date 2025-02-25 19:27:12
 */
@Data
@TableName("sms_seckill_session")
public class SeckillSessionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ³¡´ÎÃû³Æ
	 */
	private String name;
	/**
	 * Ã¿ÈÕ¿ªÊ¼Ê±¼ä
	 */
	private Date startTime;
	/**
	 * Ã¿ÈÕ½áÊøÊ±¼ä
	 */
	private Date endTime;
	/**
	 * ÆôÓÃ×´Ì¬
	 */
	private Integer status;
	/**
	 * ´´½¨Ê±¼ä
	 */
	private Date createTime;

}
