package com.company.project.service;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.IService;
import com.company.project.entity.WzMonecardEntity;

/**
 * ${comments}
 *
 * @author wangzhibin
 * @email *****@mail.com
 * @date 2022-07-06 14:18:14
 */
@Service
@DS(value="sqlForOracle")
public interface WzMonecardService {

    public WzMonecardEntity getWzMonecardByBusNo();
	
	public String add();
	
	public String delete();
	
	public String update();
	
	public String sekect();
	
}

