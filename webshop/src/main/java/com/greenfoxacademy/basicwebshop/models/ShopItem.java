package com.greenfoxacademy.basicwebshop.models;

public class ShopItem {
    private String name;
    private String description;
    private int price;
    private int quantityOfStock;

    public ShopItem(String name, String description, Integer price, Integer quantityOfStock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityOfStock = quantityOfStock;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getStock() {
        return quantityOfStock;
    }
}
