package com.yuan.controller;

import com.yuan.service.IndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by zhyy on 2017/1/23.
 */
@Controller
public class IndexController {
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
    @Resource(name = "indexService")
    private IndexService indexService;
    @RequestMapping(value = "/gotoindex")
    public String gotoIndex(){
        logger.info("看看logger日志能不能用");
        indexService.login();
        System.err.println("hello controller");
        return "login";
    }
}
