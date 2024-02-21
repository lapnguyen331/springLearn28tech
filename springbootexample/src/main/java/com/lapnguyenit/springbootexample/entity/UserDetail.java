package com.lapnguyenit.springbootexample.entity;

import jakarta.persistence.*;

@Entity(name = "user_detail")
public class UserDetail {
    @Id
    @Column(name = "user_id")
    private int user_id;
    @Column(name = "address")
    private String address;
    @Column(name = "gender")
    private String gender;
    @Column(name = "id_card")
    private int id_card;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private Users user;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId_card() {
        return id_card;
    }

    public void setId_card(int id_card) {
        this.id_card = id_card;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
