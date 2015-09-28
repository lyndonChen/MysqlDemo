package com.camelot.demo.controller;

import com.camelot.demo.domain.Demo;
import com.camelot.demo.service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by chend on 2015/9/22.
 */
@Controller
public class HomeController {

    @Resource
    private DemoService demoService;
    @RequestMapping("/home")
    public String home(ModelMap modelMap){
        try{
            Demo demo = new Demo();
            demo.setId(3334);
            demo.setName("dddddd");
            demoService.create(demo);
        }catch (Exception e){

        }

        return "index";
    }

    @RequestMapping("/list")
    public String list(ModelMap modelMap){
        List<Demo> demoList = demoService.list();
        modelMap.put("demoList",demoList);
        modelMap.put("name","s");
        return "index";
    }
}
