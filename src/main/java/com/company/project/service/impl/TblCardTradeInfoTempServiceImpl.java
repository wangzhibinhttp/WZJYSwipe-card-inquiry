package com.company.project.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.company.project.entity.TblCardTradeInfoTempEntity;
import com.company.project.mapper.TblCardTradeInfoTempMapper;
import com.company.project.service.TblCardTradeInfoTempService;


@DS(value="sqlServer")
@Service("tblCardTradeInfoTempService")
public class TblCardTradeInfoTempServiceImpl extends ServiceImpl<TblCardTradeInfoTempMapper, TblCardTradeInfoTempEntity> implements TblCardTradeInfoTempService {
	

}