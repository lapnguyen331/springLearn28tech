package com.example.osahaneat.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity(name = "Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    @Column(name ="user_name" )
    private String userName ;
    @Column(name = "password")
	private String password;
    @Column(name = "fullname")
    private String fullname;
    @Column(name = "created_date")
    private Date created_date;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Roles roles;

    @OneToMany(mappedBy = "user")
    private Set<RatingFood> ratingFoodList;
    @OneToMany(mappedBy = "user")
    private Set<RatingRestaurant> ratingRestaurant;
    @OneToMany(mappedBy = "user")
    private Set<Orders> ordersList;

    public Set<RatingRestaurant> getRatingRestaurant() {
        return ratingRestaurant;
    }

    public void setRatingRestaurant(Set<RatingRestaurant> ratingRestaurant) {
        this.ratingRestaurant = ratingRestaurant;
    }

    public Set<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(Set<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    public Set<RatingFood> getRatingFoodList() {
        return ratingFoodList;
    }

    public void setRatingFoodList(Set<RatingFood> ratingFoodList) {
        this.ratingFoodList = ratingFoodList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }
}
