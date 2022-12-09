package com.company.project.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import com.company.project.entity.BaseEntity;


import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * ${comments}
 *
 * @author wangzhibin
 * @email *****@mail.com
 * @date 2022-07-05 15:30:34
 */
@Data
@TableName("mot_trade_lking")
public class MotTradeLkingEntity extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 序号
	 */
	@TableId("id")
	private String id;

	/**
	 * 设备编号
	 */
	@TableField("censeq")
	private String censeq;

	/**
	 * 日期
	 */
	@TableField("centdate")
	private Date centdate;

	/**
	 * 卡号
	 */
	@TableField("cardno")
	private String cardno;


}
