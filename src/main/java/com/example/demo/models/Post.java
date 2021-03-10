package com.example.demo.models;

public class Post {
    private String foodType;
    private String description;
    private String address;
    private String firm;
    private String title;


    public Post(String foodType, String description, String address, String firm, String title) {
        this.foodType = foodType;
        this.description = description;
        this.address = address;
        this.firm = firm;
        this.title = title;
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

    public String getTitle() {
        return title;
    }
}
