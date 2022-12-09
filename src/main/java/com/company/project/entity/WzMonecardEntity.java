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
 * @date 2022-07-06 14:18:14
 */
@Data
@TableName("WZ_MoneCard")
public class WzMonecardEntity extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * $column.comments
	 */
	@TableId("id")
	private String id;

	/**
	 * $column.comments
	 */
	@TableField("card_no")
	private String cardNo;

	/**
	 * 乘车时间
	 */
	@TableField("riding_time")
	private Date ridingTime;

	/**
	 * 开始时间
	 */
	@TableField(exist = false)
	private Date startTime;

	/**
	 * 结束时间
	 */
	@TableField(exist = false)
	private Date endTime;
	
	/**
	 * $column.comments
	 */
	@TableField("bus_no")
	private String busNo;

	/**
	 * $column.comments
	 */
	@TableField(exist = false)
	private String busNoA;

	/**
	 * $column.comments
	 */
	@TableField(exist = false)
	private String busNoB;

	/**
	 * $column.comments
	 */
	@TableField("card_name")
	private String cardName;

	/**
	 * $column.comments
	 */
	@TableField("id_no")
	private String idNo;

	/**
	 * $column.comments
	 */
	@TableField("tel")
	private String tel;


}
