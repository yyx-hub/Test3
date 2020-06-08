package com.bookstore.commons.beans;

import java.util.Date;

/**
 * @author 杨宇翔
 * @version 1.0
 * @date 2020/5/8 11:07
 */
public class Notice {
    private Integer n_id;
    private String title;
    private String details;
    private Date n_time;

    public Integer getN_id() {
        return n_id;
    }

    public void setN_id(Integer n_id) {
        this.n_id = n_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getN_time() {
        return n_time;
    }

    public void setN_time(Date n_time) {
        this.n_time = n_time;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "n_id=" + n_id +
                ", title='" + title + '\'' +
                ", details='" + details + '\'' +
                ", n_time=" + n_time +
                '}';
    }
}
