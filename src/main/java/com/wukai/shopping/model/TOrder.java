package com.wukai.shopping.model;

public class TOrder {
    private Integer id;

    private Integer buyerId;

    private Integer goodId;

    private Integer goodNum;

    private Double totalPrice;

    public Integer getOrderStatu() {
        return orderStatu;
    }

    public void setOrderStatu(Integer orderStatu) {
        this.orderStatu = orderStatu;
    }

    private Integer orderStatu;

    private TGood good;

    public TGood getGood() {
        return good;
    }

    public void setGood(TGood good) {
        this.good = good;
    }

    public TUser getUser() {
        return user;
    }

    public void setUser(TUser userName) {
        this.user = user;
    }

    private TUser user;


    public TOrder(Integer id, Integer buyerId, Integer goodId, Integer goodNum, Double totalPrice, Integer orderStatu) {
        this.id = id;
        this.buyerId = buyerId;
        this.goodId = goodId;
        this.goodNum = goodNum;
        this.totalPrice = totalPrice;
        this.orderStatu=orderStatu;
    }

    public TOrder() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public Integer getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(Integer goodNum) {
        this.goodNum = goodNum;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}