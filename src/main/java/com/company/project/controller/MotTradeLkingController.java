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

import com.company.project.entity.MotTradeLkingEntity;
import com.company.project.service.MotTradeLkingService;



/**
 * ${comments}
 *
 * @author wangzhibin
 * @email *****@mail.com
 * @date 2022-07-05 15:30:34
 */
@Controller
@RequestMapping("/")
public class MotTradeLkingController {
    @Autowired
    private MotTradeLkingService motTradeLkingService;


    /**
    * 跳转到页面
    */
    @GetMapping("/index/motTradeLking")
    public String motTradeLking() {
        return "mottradelking/list";
        }

    @ApiOperation(value = "新增")
    @PostMapping("motTradeLking/add")
    @RequiresPermissions("motTradeLking:add")
    @ResponseBody
    public DataResult add(@RequestBody MotTradeLkingEntity motTradeLking){
        motTradeLkingService.save(motTradeLking);
        return DataResult.success();
    }

    @ApiOperation(value = "删除")
    @DeleteMapping("motTradeLking/delete")
    @RequiresPermissions("motTradeLking:delete")
    @ResponseBody
    public DataResult delete(@RequestBody @ApiParam(value = "id集合") List<String> ids){
        motTradeLkingService.removeByIds(ids);
        return DataResult.success();
    }

    @ApiOperation(value = "更新")
    @PutMapping("motTradeLking/update")
    @RequiresPermissions("motTradeLking:update")
    @ResponseBody
    public DataResult update(@RequestBody MotTradeLkingEntity motTradeLking){
        motTradeLkingService.updateById(motTradeLking);
        return DataResult.success();
    }

    @ApiOperation(value = "查询分页数据")
    @PostMapping("motTradeLking/listByPage")
    @RequiresPermissions("motTradeLking:list")
    @ResponseBody
    public DataResult findListByPage(@RequestBody MotTradeLkingEntity motTradeLking){
        Page page = new Page(motTradeLking.getPage(), motTradeLking.getLimit());
        LambdaQueryWrapper<MotTradeLkingEntity> queryWrapper = Wrappers.lambdaQuery();
        //查询条件示例
        //queryWrapper.eq(MotTradeLkingEntity::getId, motTradeLking.getId());
        IPage<MotTradeLkingEntity> iPage = motTradeLkingService.page(page, queryWrapper);
        return DataResult.success(iPage);
    }

}
