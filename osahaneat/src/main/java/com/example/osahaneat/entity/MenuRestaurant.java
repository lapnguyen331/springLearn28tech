package com.example.osahaneat.entity;

import com.example.osahaneat.entity.keys.IdMenuRestaurant;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity(name = "MenuRestaurant")
@IdClass(IdMenuRestaurant.class)
public class MenuRestaurant {
    @Id
    private int cateId ;
    @Id
    private int resId ;
    @Column(name = "create_date")
    private Date createDate ;

    @ManyToOne
    @JoinColumn(name = "cate_id",insertable = false,updatable = false)
    private Category category;

    @ManyToOne
    @JoinColumn(name = "res_id",insertable = false,updatable = false)
    private Restaurant restaurant;

    public int getCateId() {
        return cateId;
    }

    public void setCateId(int cateId) {
        this.cateId = cateId;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
