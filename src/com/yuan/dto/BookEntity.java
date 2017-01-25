package com.yuan.dto;

import java.io.Serializable;

/**
 * Created by zhangyuanyuan031 on 2017/1/25.
 */
public class BookEntity implements Serializable {
    private String id;
    private String bookName;
    private Float price;

    @Override
    public String toString() {
        return "BookEntity{" +
                "id='" + id + '\'' +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                '}';
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
