package com.greenfoxacademy.basicwebshop.services;

import com.greenfoxacademy.basicwebshop.models.ShopItem;
import com.greenfoxacademy.basicwebshop.repositories.Product;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.greenfoxacademy.basicwebshop.repositories.Product.getProduct;

public class FilterService {
    public static List<ShopItem> filterByType(String type) {
        List<ShopItem> productList = Product.getProduct();
        return productList.stream()
                .filter(p -> p.getDescription().toLowerCase().contains(type.toLowerCase())
                        || p.getName().toLowerCase().contains(type.toLowerCase())
                        || p.getType().toLowerCase().contains(type.toLowerCase()))
                .collect(Collectors.toList());
    }

    public static List<ShopItem> availableList() {
        List<ShopItem> productList = Product.getProduct();
        return productList.stream()
                .filter(p -> p.getStock() > 0)
                .collect(Collectors.toList());
    }

    public static List<ShopItem> risingPriceList() {
        List<ShopItem> productList = Product.getProduct();
        return productList.stream()
                .sorted((p1, p2) -> p1.getPrice() - p2.getPrice())
                .collect(Collectors.toList());
    }

    public static Double averageStock() {
        List<ShopItem> productList = Product.getProduct();
        return productList.stream()
                .map(p -> p.getStock())
                .mapToDouble(p -> p.doubleValue())
                .average().getAsDouble();
    }

    public static ShopItem mostExpensive() {
        List<ShopItem> productList = Product.getProduct();
        Optional<ShopItem> mostExpensive = productList.stream()
                .filter(p -> p.getStock() > 0)
                .sorted((p1, p2) -> p2.getPrice() - p1.getPrice())
                .findFirst();
        ShopItem result;
        if (mostExpensive.isPresent()) {
            result = mostExpensive.get();
        } else {
            result = null;
        }
        return result;
    }

    public static List<ShopItem> searchList(String search) {
        List<ShopItem> productList = Product.getProduct();
        return productList.stream()
                .filter(p -> p.getDescription().toLowerCase().contains(search.toLowerCase())
                        || p.getName().toLowerCase().contains(search.toLowerCase())
                        || p.getType().toLowerCase().contains(search.toLowerCase()))
                .collect(Collectors.toList());
    }

    public static List<ShopItem> filterByPrice(String limitType, Integer limit) {
        List<ShopItem> productList = Product.getProduct();
        if (limitType.equals("Below")) {
            return productList.stream()
                    .filter(p -> p.getPrice() < limit)
                    .collect(Collectors.toList());
        } else if (limitType.equals("Above")) {
            return productList.stream()
                    .filter(p -> p.getPrice() > limit)
                    .collect(Collectors.toList());
        } else {
            return productList.stream()
                    .filter(p -> p.getPrice() == limit)
                    .collect(Collectors.toList());
        }
    }
}

