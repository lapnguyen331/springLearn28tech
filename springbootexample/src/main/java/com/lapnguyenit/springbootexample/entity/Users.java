package com.lapnguyenit.springbootexample.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity(name="users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="fullname")
    private String fullName;
    @Column(name="age")
    private int age;
    @Column(name="username")

    private String username;
    @Column(name="password")

    private String password;
    @Column(name="created_date")

    private Date created_date;
//    mapping
    @ManyToOne
    @JoinColumn(name="role_id")
    private Roles roles;

    @OneToOne
    @PrimaryKeyJoinColumn
    private UserDetail userDetail;
    @OneToMany(mappedBy = "user")
    private List<Tasks> tasksList;

    public List<Tasks> getTasksList() {
        return tasksList;
    }

    public void setTasksList(List<Tasks> tasksList) {
        this.tasksList = tasksList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }
}
