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

import com.company.project.entity.WzMonecardEntity;
import com.company.project.service.WzMonecardService;



/**
 * ${comments}
 *
 * @author wangzhibin
 * @email *****@mail.com
 * @date 2022-07-06 14:18:14
 */
@Controller
@RequestMapping("/")
public class WzMonecardController {
    @Autowired
    private WzMonecardService wzMonecardService;

    /**
    * 跳转到页面
    */
    @GetMapping("/index/wzMonecard")
    public String wzMonecard() {
        return "wzmonecard/list";
        }

    @ApiOperation(value = "新增")
    @PostMapping("wzMonecard/add")
    @RequiresPermissions("wzMonecard:add")
    @ResponseBody
    public DataResult add(@RequestBody WzMonecardEntity wzMonecard){
        wzMonecardService.save(wzMonecard);
        return DataResult.success();
    }

    @ApiOperation(value = "删除")
    @DeleteMapping("wzMonecard/delete")
    @RequiresPermissions("wzMonecard:delete")
    @ResponseBody
    public DataResult delete(@RequestBody @ApiParam(value = "id集合") List<String> ids){
        wzMonecardService.removeByIds(ids);
        return DataResult.success();
    }

    @ApiOperation(value = "更新")
    @PutMapping("wzMonecard/update")
    @RequiresPermissions("wzMonecard:update")
    @ResponseBody
    public DataResult update(@RequestBody WzMonecardEntity wzMonecard){
        wzMonecardService.updateById(wzMonecard);
        return DataResult.success();
    }

    @ApiOperation(value = "查询分页数据")
    @PostMapping("wzMonecard/listByPage")
    @RequiresPermissions("wzMonecard:list")
    @ResponseBody
    public DataResult findListByPage(@RequestBody WzMonecardEntity wzMonecard){
        Page page = new Page(wzMonecard.getPage(), wzMonecard.getLimit());
        LambdaQueryWrapper<WzMonecardEntity> queryWrapper = Wrappers.lambdaQuery();
        //查询条件示例
        //queryWrapper.eq(WzMonecardEntity::getId, wzMonecard.getId());
        IPage<WzMonecardEntity> iPage = wzMonecardService.page(page, queryWrapper);
        return DataResult.success(iPage);
    }

}
