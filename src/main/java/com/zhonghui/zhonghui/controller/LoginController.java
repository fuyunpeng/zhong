package com.zhonghui.zhonghui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {


    @RequestMapping("/index")
    public String index(){
        return "html/index";
    }


    @RequestMapping("/indexwel")
    public String indexwel(){
        return "index_wel";
    }


    @RequestMapping("/indexinthml")
    public String indexinthml(){
        return "html/index_wel";
    }


//    @ResponseBody
//    @RequestMapping("/getkey")
//    public  String index(){
//    }



}
