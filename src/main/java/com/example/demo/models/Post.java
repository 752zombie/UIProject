package com.example.demo.models;

public class Post {
    String foodType;
    String description;
    String address;
    String firm;


    public Post(String foodType, String description, String address, String firm) {
        this.foodType = foodType;
        this.description = description;
        this.address = address;
        this.firm = firm;
    }

    public String getFoodType() {
        return foodType;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public String getFirm() {
        return firm;
    }
}
