package com.example.osahaneat.entity;

import com.example.osahaneat.entity.keys.IdOrderItem;
import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "OrderItem")
@IdClass(IdOrderItem.class)
public class OrderItem {
    @Id
    private int order_id;
    @Id
    private int food_id;
    @Column(name = "create_date")
    private Date createDate;

    @ManyToOne
    @JoinColumn(name = "order_id",insertable = false,updatable = false)
    private Orders orders;
    @ManyToOne
    @JoinColumn(name = "food_id",insertable = false,updatable = false)
    private Food food;

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getFood_id() {
        return food_id;
    }

    public void setFood_id(int food_id) {
        this.food_id = food_id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }
}
