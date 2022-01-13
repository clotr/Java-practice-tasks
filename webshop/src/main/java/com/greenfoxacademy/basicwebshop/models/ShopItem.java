package com.greenfoxacademy.basicwebshop.models;

public class ShopItem {
    private String name;
    private String description;
    private String type;
    private int price;
    private double priceInEuro;
    private int quantityOfStock;

    public ShopItem(String name, String description, String type, Integer price, Integer quantityOfStock) {
        this.name = name;
        this.description = description;
        this.type=type;
        this.price = price;
        this.priceInEuro = Math.round((double)price/355*100d)/100d;
        this.quantityOfStock = quantityOfStock;

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public double getPriceInEuro() {
        return priceInEuro;
    }

    public Integer getStock() {
        return quantityOfStock;
    }
}
