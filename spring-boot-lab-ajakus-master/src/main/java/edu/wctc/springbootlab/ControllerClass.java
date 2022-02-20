package edu.wctc.springbootlab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class ControllerClass {
    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }
    @GetMapping("/view-cart")
    public String showCart(){
        return "cart";
    }
    @RequestMapping("/product/detail")
    public String showProduct() {
        return "product-detail";
    }
    @PostMapping("/place-order")
    public String placeOrders() {
        return "redirect:/";
    }
    @RequestMapping("/search")
    public String googleSearch() {
        return "redirect:http://www.google.com";
    }


}
