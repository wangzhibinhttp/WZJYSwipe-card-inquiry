package com.company.project.service;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.IService;
import com.company.project.entity.MotTradeLkingEntity;

/**
 * ${comments}
 *
 * @author wangzhibin
 * @email *****@mail.com
 * @date 2022-07-05 15:30:34
 */

//@DS(value="sqlAllpayOra")
public interface MotTradeLkingService extends IService<MotTradeLkingEntity> {
	
	public List<MotTradeLkingEntity> selectAllTables();
}

