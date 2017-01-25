package com.yuan.dao;

import com.yuan.dto.BookEntity;
import com.yuan.dto.LoginEntity;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.Date;


/**
 * Created by zhangyuanyuan031 on 2017/1/24.
 */
@Repository(value = "indexDao")
public class IndexDaoImpl  implements IndexDao {
    private static final Logger logger = LoggerFactory.getLogger(IndexDaoImpl.class);

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public void save1() {
        logger.info("第一个方法"+sqlSessionTemplate);
        BookEntity bookEntity = new BookEntity();
        bookEntity.setBookName("jquery");
        bookEntity.setPrice(100.0f);
        sqlSessionTemplate.insert("com.yuan.dao.insertBook",bookEntity);
    }

    @Override
    public void save2() {
        logger.info("第二个方法 "+sqlSessionTemplate);
        LoginEntity loginEntity = new LoginEntity();
        loginEntity.setPwd("123456");
        loginEntity.setEmail("zhyyituse@163.com");
        loginEntity.setCardId("123");
        loginEntity.setCreateDate(new Date());
        loginEntity.setUserName("vip_login");
        sqlSessionTemplate.insert("com.yuan.dto.Login.insert",loginEntity);

    }

/*    @Autowired
    private  JdbcTemplate jdbcTemplate;

    @Override
    public void save1() {
        String sql="INSERT INTO book (id,book_name,price) VALUES ('456','JAVASCRIPT',18)";
        jdbcTemplate.update(sql);
    }

    @Override
    public void save2() {
//        JdbcTemplate jdbcTemplate = this.getJdbcTemplate();
        jdbcTemplate.update("INSERT INTO book (id,book_name,price) VALUES ('123','java',88)");
    }*/








}
