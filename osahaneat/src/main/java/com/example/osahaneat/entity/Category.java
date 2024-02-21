package com.example.osahaneat.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity(name = "Category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    @Column(name = "name_date")
    private String nameCate ;
    @Column(name = "create_date")
    private Date createDate;
    @OneToMany(mappedBy = "category")
    private Set<Food> foodList;

    @OneToMany(mappedBy = "category")
    private Set<MenuRestaurant> menuRestaurant;

    public Set<MenuRestaurant> getMenuRestaurant() {
        return menuRestaurant;
    }

    public void setMenuRestaurant(Set<MenuRestaurant> menuRestaurant) {
        this.menuRestaurant = menuRestaurant;
    }

    public Set<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(Set<Food> foodList) {
        this.foodList = foodList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCate() {
        return nameCate;
    }

    public void setNameCate(String nameCate) {
        this.nameCate = nameCate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
