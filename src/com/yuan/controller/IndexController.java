package com.yuan.controller;

import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhyy on 2017/1/23.
 */
@Controller
public class IndexController {

    @RequestMapping("/gotoindex")
    public String gotoIndex(){
        System.err.println("hello controller");
        return "index";
    }
}
