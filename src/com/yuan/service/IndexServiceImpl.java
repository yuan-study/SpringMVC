package com.yuan.service;

import com.yuan.dao.IndexDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhangyuanyuan031 on 2017/1/24.
 */
@Service(value = "indexService")
public class IndexServiceImpl implements IndexService {
    private static final Logger logger = LoggerFactory.getLogger(IndexServiceImpl.class);
    @Resource(name = "indexDao")
    private IndexDao indexDao;
    @Override
    public void login() {
        logger.info("打印一下");
        System.err.println("看看有没有问题");
        indexDao.save1();
        indexDao.save2();

    }
}
