package com.example.osahaneat.entity.keys;

import jakarta.persistence.Column;

import java.io.Serializable;

public class IdOrderItem implements Serializable {
    @Column(name = "order_id")
    private int orderId;
    @Column(name = "food_id")
    private int foodId;

    public IdOrderItem(int orderId, int foodId) {
        this.orderId = orderId;
        this.foodId = foodId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }
}
