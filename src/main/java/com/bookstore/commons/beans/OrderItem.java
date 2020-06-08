package com.bookstore.commons.beans;

/**
 * @author 杨宇翔
 * @version 1.0
 * @date 2020/4/28 9:50
 */
public class OrderItem {
    //关联属性
    private Order order;
    private Product product;
    private int buynum;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getBuynum() {
        return buynum;
    }

    public void setBuynum(int buynum) {
        this.buynum = buynum;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "order=" + order +
                ", product=" + product +
                ", buynum=" + buynum +
                '}';
    }
}
