package com.greenfoxacademy.basicwebshop.controllers;

import com.greenfoxacademy.basicwebshop.models.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.greenfoxacademy.basicwebshop.repositories.Product.getProduct;

@Controller
public class MainController {

    @GetMapping("/index")
    public String renderIndexPage(Model model) {
        List<ShopItem> productList = getProduct();
        model.addAttribute("productList", productList);
        model.addAttribute("hideTable", false);
        return "index";
    }

    @GetMapping("/available")
    public String listAvailableOnly(Model model) {
        List<ShopItem> productList = getProduct();
        List<ShopItem> availableList = productList.stream()
                .filter(p -> p.getStock() > 0)
                .collect(Collectors.toList());
        model.addAttribute("productList", availableList);
        model.addAttribute("hideTable", false);
        return "index";
    }

    @GetMapping("/cheapest")
    public String cheapestFirst(Model model) {
        List<ShopItem> productList = getProduct();
        List<ShopItem> risingPriceList = productList.stream()
                .sorted((p1, p2) -> p1.getPrice() - p2.getPrice())
                .collect(Collectors.toList());
        model.addAttribute("productList", risingPriceList);
        model.addAttribute("hideTable", false);
        return "index";
    }

    @GetMapping("/contains")
    public String containsMosaic(Model model) {
        List<ShopItem> productList = getProduct();
        List<ShopItem> mosaicList = productList.stream()
                .filter(p -> p.getDescription().toLowerCase().contains("mosaic")
                        || p.getName().toLowerCase().contains("mosaic"))
                .collect(Collectors.toList());
        model.addAttribute("productList", mosaicList);
        model.addAttribute("hideTable", false);
        return "index";
    }

    @GetMapping("/average")
    public String averageStock(Model model) {
        List<ShopItem> productList = getProduct();
        Double average = productList.stream()
                .map(p -> p.getPrice() * p.getStock())
                .mapToDouble(p -> p.doubleValue())
                .average().getAsDouble();
        model.addAttribute("average", average);
        model.addAttribute("hideTable", true);
        return "index";
    }

    @GetMapping("/expensive")
    public String mostExpensive(Model model) {
        List<ShopItem> productList = getProduct();
        Optional<ShopItem> mostExpensive = productList.stream()
                .filter(p -> p.getStock() > 0)
                .sorted((p1, p2) -> p2.getPrice() - p1.getPrice())
                .findFirst();
        if (mostExpensive.isPresent()) {
            model.addAttribute("productList", mostExpensive.get());
        }
        model.addAttribute("hideTable", false);
        return "index";
    }

    @PostMapping("/index")
    public String searchProduct(Model model, @RequestParam String search) {
        System.out.println(search);
        List<ShopItem> productList = getProduct();
        List<ShopItem> searchedList = productList.stream()
                .filter(p -> p.getDescription().toLowerCase().contains(search.toLowerCase())
                        || p.getName().toLowerCase().contains(search.toLowerCase()))
                .collect(Collectors.toList());
        model.addAttribute("productList", searchedList);
        model.addAttribute("hideTable", false);
        return "index";
    }
}
