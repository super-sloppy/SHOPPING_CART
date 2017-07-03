package com.wukai.shopping.model;

public class TGood {
    private Integer id;

    private String goodName;

    private String goodIntro;

    private Double goodPrice;

    private String imageUrl;

    public TGood(){

    }

    public TGood(Integer id, String goodName, String goodIntro, Double goodPrice, String imageUrl) {
        this.id = id;
        this.goodName = goodName;
        this.goodIntro = goodIntro;
        this.goodPrice = goodPrice;
        this.imageUrl = imageUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName == null ? null : goodName.trim();
    }

    public String getGoodIntro() {
        return goodIntro;
    }

    public void setGoodIntro(String goodIntro) {
        this.goodIntro = goodIntro == null ? null : goodIntro.trim();
    }

    public Double getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(Double goodPrice) {
        this.goodPrice = goodPrice;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    @Override
    public String toString() {
        return "TGood{" +
                "id=" + id +
                ", goodName='" + goodName + '\'' +
                ", goodIntro='" + goodIntro + '\'' +
                ", goodPrice=" + goodPrice +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}