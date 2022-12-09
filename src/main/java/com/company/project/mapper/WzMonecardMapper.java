package com.company.project.mapper;

import java.util.Date;
import java.util.List;

import com.baomidou.mybatisplus.annotation.SqlParser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.company.project.entity.WzMonecardEntity;

/**
 * ${comments}
 * 
 * @author wangzhibin
 * @email *****@mail.com
 * @date 2022-07-06 14:18:14
 */

@Mapper
@Repository
@DS(value="sqlForOracle")
public interface WzMonecardMapper extends BaseMapper<WzMonecardEntity> {

//    public List<WzMonecardEntity> findallBybusNo(@Param("riding_time")Date time, @Param("bus_no")String busnos);



    public WzMonecardEntity getWzMonecardByBusNo(@Param("busNo")String busnos, @Param("ridingTime")Date time);

}
