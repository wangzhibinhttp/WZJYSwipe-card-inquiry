package com.company.project.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.company.project.mapper.WzMonecardMapper;
import com.company.project.entity.WzMonecardEntity;
import com.company.project.service.WzMonecardService;


@Service
@DS(value="sqlForOracle")
public class WzMonecardServiceImpl  extends ServiceImpl<WzMonecardMapper, WzMonecardEntity> implements WzMonecardService{
    WzMonecardMapper wzMonecardMapper;

//    @Override
//    public List<WzMonecardEntity> findallBybusNo(Date time, String busnos) {
//        return null;
//    }
    @Override
    public WzMonecardEntity getWzMonecardByBusNo(@Param("busNo")String busnos, @Param("ridingTime")Date time){
        return wzMonecardMapper.getWzMonecardByBusNo(busnos,time);
    }


//	private WzMonecardMapper wzMonecardmapper;
//
//	public List<WzMonecardEntity> findall() {
//		List<WzMonecardEntity>  findalltables = wzMonecardmapper.findall();
//		return findalltables;
//	}
}