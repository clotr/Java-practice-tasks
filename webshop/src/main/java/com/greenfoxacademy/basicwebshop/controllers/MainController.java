package com.greenfoxacademy.basicwebshop.controllers;

import com.greenfoxacademy.basicwebshop.models.ShopItem;
import com.greenfoxacademy.basicwebshop.services.FilterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.greenfoxacademy.basicwebshop.repositories.Product.getProduct;

@Controller
public class MainController {

    @GetMapping("/index")
    public String renderIndexPage(Model model) {
        model.addAttribute("productList", getProduct());
        model.addAttribute("hideTable", false);
        model.addAttribute("priceInEUR", false);
        model.addAttribute("firstPage", true);
        return "index";
    }

    @GetMapping("/more")
    public String renderMorePage(Model model) {
        model.addAttribute("productList", getProduct());
        model.addAttribute("hideTable", false);
        model.addAttribute("priceInEUR", false);
        model.addAttribute("firstPage", false);
        return "index";
    }

    @GetMapping("/price-in-eur")
    public String eurPage(Model model) {
        model.addAttribute("productList", getProduct());
        model.addAttribute("hideTable", false);
        model.addAttribute("priceInEUR", true);
        model.addAttribute("firstPage", false);
        return "index";
    }

    @GetMapping("/filter-by-type/{type}")
    public String filterByType(Model model, @PathVariable String type) {
        model.addAttribute("productList", FilterService.filterByType(type));
        model.addAttribute("hideTable", false);
        model.addAttribute("priceInEUR", false);
        model.addAttribute("firstPage", false);
        return "index";
    }

    @GetMapping("/available")
    public String listAvailableOnly(Model model) {
        model.addAttribute("productList", FilterService.availableList());
        model.addAttribute("hideTable", false);
        model.addAttribute("priceInEUR", false);
        model.addAttribute("firstPage", true);
        return "index";
    }

    @GetMapping("/cheapest")
    public String cheapestFirst(Model model) {
        model.addAttribute("productList", FilterService.risingPriceList());
        model.addAttribute("hideTable", false);
        model.addAttribute("priceInEUR", false);
        model.addAttribute("firstPage", true);
        return "index";
    }


    @GetMapping("/average")
    public String averageStock(Model model) {
        model.addAttribute("average", FilterService.averageStock());
        model.addAttribute("hideTable", true);
        model.addAttribute("priceInEUR", false);
        model.addAttribute("firstPage", true);
        return "index";
    }

    @GetMapping("/expensive")
    public String mostExpensive(Model model) {
        model.addAttribute("productList", FilterService.mostExpensive());
        model.addAttribute("hideTable", false);
        model.addAttribute("priceInEUR", false);
        model.addAttribute("firstPage", true);
        return "index";
    }

    @GetMapping("/filter")
    public String priceFilter(Model model, @RequestParam String limitType, @RequestParam Integer limit) {
        model.addAttribute("productList", FilterService.filterByPrice(limitType, limit));
        model.addAttribute("hideTable", false);
        model.addAttribute("priceInEUR", false);
        model.addAttribute("firstPage", false);
        return "index";
    }

    @PostMapping({"/index", "/filter-by-type/mosaic", "/available", "/cheapest", "/expensive"})
    public String searchProduct(Model model, @RequestParam String search) {
        model.addAttribute("productList", FilterService.searchList(search));
        model.addAttribute("hideTable", false);
        model.addAttribute("priceInEUR", false);
        model.addAttribute("firstPage", true);
        return "index";
    }
}
