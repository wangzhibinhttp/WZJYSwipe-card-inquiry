package com.company.project.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.company.project.mapper.MotTradeLkingMapper;
import com.company.project.entity.MotTradeLkingEntity;
import com.company.project.service.MotTradeLkingService;

//@DS(value="sqlAllpayOra")
@Service("motTradeLkingService")
public class MotTradeLkingServiceImpl extends ServiceImpl<MotTradeLkingMapper, MotTradeLkingEntity> implements MotTradeLkingService {

	MotTradeLkingMapper motTradeLkingmapper;
	
	@Override
	public List<MotTradeLkingEntity> selectAllTables() {
		List<MotTradeLkingEntity> findall = motTradeLkingmapper.selectAllTables();
		return findall;
	}


}