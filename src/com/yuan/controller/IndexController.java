package com.yuan.controller;

import com.yuan.service.IndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhyy on 2017/1/23.
 */
@Controller
@RequestMapping("/index.do")
public class IndexController {
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Value("${tag}")
//    @Value("#{propertiesConfig['tag']}")
    private String tag;
    @Value("#{propertiesConfig['uname']}")
//    @Value("${uname}")
    private String uname;

    @RequestMapping
    public void abc(ModelMap model, HttpServletRequest request){
        System.out.println("hello word");
        System.out.println(tag);
        System.err.println("username is "+ uname);

        Object obj = new Object();
        System.out.println(obj.toString());

    }

    @Resource(name = "indexService")
    private IndexService indexService;
    @RequestMapping(params = "command=index")
    public String gotoIndex(){
        logger.info("看看logger日志能不能用");
        indexService.login();
        System.err.println("hello controller");
        return "login";
    }
}
