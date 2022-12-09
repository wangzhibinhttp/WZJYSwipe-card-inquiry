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
 * @author wenbin
 * @email *****@mail.com
 * @date 2022-07-01 14:46:42
 */
@Data
@TableName("tbl_card_trade_info_temp")
public class TblCardTradeInfoTempEntity extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId("line_no")
	private String lineNo;

	/**
	 * $column.comments
	 */
	@TableField("line_name")
	private String lineName;

	/**
	 * $column.comments
	 */
	@TableField("bus_no")
	private String busNo;

	/**
	 * $column.comments
	 */
	@TableField("riding_time")
	private Date ridingTime;

	/**
	 * $column.comments
	 */
	@TableField("card_no")
	private String cardNo;

	/**
	 * $column.comments
	 */
	@TableField("name")
	private String name;

	/**
	 * $column.comments
	 */
	@TableField("id_no")
	private String idNo;

	/**
	 * $column.comments
	 */
	@TableField("tel_no")
	private String telNo;

	/**
	 * $column.comments
	 */
	@TableField("card_category")
	private String cardCategory;


}
