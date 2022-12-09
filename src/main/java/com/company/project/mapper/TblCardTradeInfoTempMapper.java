package com.company.project.mapper;

import com.company.project.entity.TblCardTradeInfoTempEntity;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * ${comments}
 * 
 * @author wenbin
 * @email *****@mail.com
 * @date 2022-07-01 14:46:42
 */
@DS(value="sqlServer")
public interface TblCardTradeInfoTempMapper extends BaseMapper<TblCardTradeInfoTempEntity> {
	
}
