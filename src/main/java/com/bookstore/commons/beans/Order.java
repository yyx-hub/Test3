package com.bookstore.commons.beans;


import java.sql.Timestamp;

/**
 * @author 杨宇翔
 * @version 1.0
 * @date 2020/4/28 9:46
 */
public class Order {
    private String id;
    private double money;
    private String receiverAddress;
    private String receiverName;
    private String receiverPhone;
    private int paystate;
    private Timestamp ordertime;
   // private Timestamp ordertime;
    //关联属性
    private User user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public int getPaystate() {
        return paystate;
    }

    public void setPaystate(int paystate) {
        this.paystate = paystate;
    }

    public Timestamp getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Timestamp ordertime) {
        this.ordertime = ordertime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", money=" + money +
                ", receiverAddress='" + receiverAddress + '\'' +
                ", receiverName='" + receiverName + '\'' +
                ", receiverPhone='" + receiverPhone + '\'' +
                ", paystate=" + paystate +
                ", ordertime=" + ordertime +
                ", user=" + user +
                '}';
    }
}

