package com.yuan.test;

import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * Created by zhangyuanyuan031 on 2017/1/24.
 */
public class TransionTest {
    @Test
    public void testTX() throws Exception{
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = act.getBean("dataSource", DataSource.class);
        Configuration configuration = null;
        SqlSessionFactory sqlSessionFactory = new DefaultSqlSessionFactory(configuration);
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory);
    }
}
