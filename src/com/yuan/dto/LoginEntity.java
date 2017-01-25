package com.yuan.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhangyuanyuan031 on 2017/1/25.
 */
public class LoginEntity implements Serializable {
    private String id;
    private String userName;
    private String pwd;
    private String email;
    private String cardId;
    private Date createDate;

    @Override
    public String toString() {
        return "LoginEntity{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", pwd='" + pwd + '\'' +
                ", email='" + email + '\'' +
                ", cardId='" + cardId + '\'' +
                ", createDate=" + createDate +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
