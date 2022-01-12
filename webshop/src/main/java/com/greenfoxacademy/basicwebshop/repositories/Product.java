package com.greenfoxacademy.basicwebshop.repositories;

import com.greenfoxacademy.basicwebshop.models.ShopItem;

import java.util.Arrays;
import java.util.List;

public class Product {
    public static List<ShopItem> getProduct() {
        List<ShopItem> productList = Arrays.asList(
                new ShopItem("Aztec Apocalypse", "Blond Ale with a hint of Carolina Reaper chili pepper, ABV: 5,3% ", 699, 10),
                new ShopItem("DoPanic", "American Pale Ale with Magnum, Simcoe, Amarillo hops, ABV: 5,6%", 599, 20),
                new ShopItem("Brew Darrymore", "Unfiltered Blond Ale with Citra hop, ABV: 5,6%", 599, 10),
                new ShopItem("Koron a barbár", "India Pale Ale with Mosaic hop, ABV 5,9%", 799, 6),
                new ShopItem("No Madame", "West Coast IPA with Galaxy and Mosaic hops, ABV 4,9%", 699, 2),
                new ShopItem("Flower Power", "New England IPA with tons of hop, ABV 6,3%", 699, 0),
                new ShopItem("Roller Coaster", "West Coast IPA with piney notes, ABV 5,7%", 749, 8),
                new ShopItem("Hop Terror", "Triple IPA, beware! ABV 8,8%", 699, 0),
                new ShopItem("Hop Horror", "Speechless IPA, ABV 9,3%", 999, 0),
                new ShopItem("Liquid Gold", "German style wheat beer, ABV 5,0%", 399, 19),
                new ShopItem("Mosaic Dream", "Belgian IPA with coriander, ABV 5,1%", 479, 16),
                new ShopItem("Juice Lee", "Juicy IPA with tropical notes, ABV 7,1%", 999, 11)
        );
        return productList;
    }
}
