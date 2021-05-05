package com.cug.mall.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Good {
    private Integer goodId;
    private String goodName;
    private Double price;
    private String address;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date produceDate;
    private String picture;
    private Category category;

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getProduceDate() {
        return produceDate;
    }

    public void setProduceDate(Date produceDate) {
        this.produceDate = produceDate;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Good{" +
                "goodId=" + goodId +
                ", goodName='" + goodName + '\'' +
                ", price=" + price +
                ", address='" + address + '\'' +
                ", produceDate=" + produceDate +
                ", picture='" + picture + '\'' +
                ", category=" + category +
                '}';
    }
}
