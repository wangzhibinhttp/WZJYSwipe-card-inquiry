package com.company.project.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.List;
import com.company.project.common.utils.DataResult;

import com.company.project.entity.TblCardTradeInfoTempEntity;
import com.company.project.service.TblCardTradeInfoTempService;



/**
 * ${comments}
 *
 * @author wangzhibin
 * @email *****@mail.com
 * @date 2022-07-01 14:46:42
 */
@Controller
@RequestMapping("/")
public class TblCardTradeInfoTempController {
    @Autowired
    private TblCardTradeInfoTempService tblCardTradeInfoTempService;


    /**
    * 跳转到页面
    */
    @GetMapping("/index/tblCardTradeInfoTemp")
    public String tblCardTradeInfoTemp() {
        return "tblcardtradeinfotemp/list";
        }

    @ApiOperation(value = "新增")
    @PostMapping("tblCardTradeInfoTemp/add")
    @RequiresPermissions("tblCardTradeInfoTemp:add")
    @ResponseBody
    public DataResult add(@RequestBody TblCardTradeInfoTempEntity tblCardTradeInfoTemp){
        tblCardTradeInfoTempService.save(tblCardTradeInfoTemp);
        return DataResult.success();
    }

    @ApiOperation(value = "删除")
    @DeleteMapping("tblCardTradeInfoTemp/delete")
    @RequiresPermissions("tblCardTradeInfoTemp:delete")
    @ResponseBody
    public DataResult delete(@RequestBody @ApiParam(value = "id集合") List<String> ids){
        tblCardTradeInfoTempService.removeByIds(ids);
        return DataResult.success();
    }

    @ApiOperation(value = "更新")
    @PutMapping("tblCardTradeInfoTemp/update")
    @RequiresPermissions("tblCardTradeInfoTemp:update")
    @ResponseBody
    public DataResult update(@RequestBody TblCardTradeInfoTempEntity tblCardTradeInfoTemp){
        tblCardTradeInfoTempService.updateById(tblCardTradeInfoTemp);
        return DataResult.success();
    }

    @ApiOperation(value = "查询分页数据")
    @PostMapping("tblCardTradeInfoTemp/listByPage")
    @RequiresPermissions("tblCardTradeInfoTemp:list")
    @ResponseBody
    public DataResult findListByPage(@RequestBody TblCardTradeInfoTempEntity tblCardTradeInfoTemp){
        Page page = new Page(tblCardTradeInfoTemp.getPage(), tblCardTradeInfoTemp.getLimit());
        LambdaQueryWrapper<TblCardTradeInfoTempEntity> queryWrapper = Wrappers.lambdaQuery();
        //查询条件示例
        //queryWrapper.eq(TblCardTradeInfoTempEntity::getId, tblCardTradeInfoTemp.getId());
        IPage<TblCardTradeInfoTempEntity> iPage = tblCardTradeInfoTempService.page(page, queryWrapper);
        return DataResult.success(iPage);
    }

}
