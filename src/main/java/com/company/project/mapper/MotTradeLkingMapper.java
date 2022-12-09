package com.company.project.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.company.project.entity.MotTradeLkingEntity;

/**
 * ${comments}
 * 
 * @author wangzhibin
 * @email *****@mail.com
 * @date 2022-07-05 15:30:34
 */

//@DS(value="sqlAllpayOra")
@Mapper
@Repository
public interface MotTradeLkingMapper extends BaseMapper<MotTradeLkingEntity> {
	
	public List<MotTradeLkingEntity> selectAllTables();
}
