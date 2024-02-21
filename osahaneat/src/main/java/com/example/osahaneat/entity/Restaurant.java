package com.example.osahaneat.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity(name = "Restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "subtitle")
    private String subtitle ;
    @Column(name = "description")
	private String description;
    @Column(name = "image")
    private String image;
    @Column(name = "is_freeship")
    private boolean isFreeship;
    @Column(name = "address")
    private String address ;
    @Column(name = "open_date")
    private Date openDate ;
    @OneToMany(mappedBy = "restaurant")
    private Set<RatingRestaurant> ratingRestaurantList;
    @OneToMany(mappedBy = "restaurant")
    private Set<Orders> ordersList;
    @OneToMany(mappedBy = "restaurant")
    private Set<MenuRestaurant> menuRestaurantList;
    @OneToMany(mappedBy = "restaurant")
    private Set<Promo> promoList;

    public Set<Promo> getPromoList() {
        return promoList;
    }

    public void setPromoList(Set<Promo> promoList) {
        this.promoList = promoList;
    }

    public Set<MenuRestaurant> getMenuRestaurantList() {
        return menuRestaurantList;
    }

    public void setMenuRestaurantList(Set<MenuRestaurant> menuRestaurantList) {
        this.menuRestaurantList = menuRestaurantList;
    }

    public Set<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(Set<Orders> ordersList) {
        this.ordersList = ordersList;
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

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isFreeship() {
        return isFreeship;
    }

    public void setFreeship(boolean freeship) {
        isFreeship = freeship;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public Set<RatingRestaurant> getRatingRestaurantList() {
        return ratingRestaurantList;
    }

    public void setRatingRestaurantList(Set<RatingRestaurant> ratingRestaurantList) {
        this.ratingRestaurantList = ratingRestaurantList;
    }
}
