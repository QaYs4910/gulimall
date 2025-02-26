package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ÉÌÆ·ÆÀ¼Û»Ø¸´¹ØÏµ
 * 
 * @author wuyy
 * @email QaYs4910@163.com
 * @date 2025-02-25 18:22:57
 */
@Data
@TableName("pms_comment_replay")
public class CommentReplayEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ÆÀÂÛid
	 */
	private Long commentId;
	/**
	 * »Ø¸´id
	 */
	private Long replyId;

}
