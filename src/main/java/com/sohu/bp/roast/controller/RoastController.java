package com.sohu.bp.roast.controller;

import com.sohu.bp.roast.model.BpRoast;
import com.sohu.bp.roast.model.WebResult;
import com.sohu.bp.roast.service.BpRoastService;
import com.sohu.bp.roast.util.ResultUtil;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Ambitous on 2018/3/2.
 */
@Controller
@RequestMapping("/roast")
public class RoastController {

    @Autowired
    private BpRoastService bpRoastService;

    @RequestMapping("/list/roast.json")
    @ResponseBody
    public WebResult getBpRoastList(@RequestParam(value = "orderType", defaultValue = "PUBLISH_TIME_LATEST") String orderType){
        return ResultUtil.success(bpRoastService.getBpRoastList(orderType));
    }

    @RequestMapping("/add")
    @ResponseBody
    public WebResult addBpRoast(@RequestBody BpRoast bpRoast){
        return ResultUtil.success(bpRoastService.addBpRoast(bpRoast));
    }

    @RequestMapping("/update/{article_id}")
    @ResponseBody
    public WebResult updateThumbUP(@PathVariable Long article_id){
        return ResultUtil.success(bpRoastService.updateThumbUP(article_id));
    }


}
