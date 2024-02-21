package com.example.osahaneat.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity(name = "Food")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    @Column(name = "title")
    private String title;
    @Column(name = "image")
    private String image;
    @Column(name = "time_ship")
    private Date timeShip;
    @Column(name = "price")
    private double price;
    @ManyToOne
    @JoinColumn(name = "cate_id")
    private Category category;
    @OneToMany(mappedBy = "food")
    private Set<RatingFood> ratingFoodList;
    @OneToMany(mappedBy = "food")
    private Set<OrderItem> orderItemList;

    public Set<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(Set<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getTimeShip() {
        return timeShip;
    }

    public void setTimeShip(Date timeShip) {
        this.timeShip = timeShip;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<RatingFood> getRatingFoodList() {
        return ratingFoodList;
    }

    public void setRatingFoodList(Set<RatingFood> ratingFoodList) {
        this.ratingFoodList = ratingFoodList;
    }
}
