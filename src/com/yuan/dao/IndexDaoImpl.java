package com.yuan.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.sql.DataSource;


/**
 * Created by zhangyuanyuan031 on 2017/1/24.
 */
@Repository(value = "indexDao")
public class IndexDaoImpl  implements IndexDao {

    @Autowired
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
    }

}
