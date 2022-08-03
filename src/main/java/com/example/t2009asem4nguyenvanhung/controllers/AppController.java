package com.example.t2009asem4nguyenvanhung.controllers;

import com.example.t2009asem4nguyenvanhung.entity.Stock;
import com.example.t2009asem4nguyenvanhung.services.StockServicelmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
@Controller
public class AppController {
    @Autowired
    private StockServicelmpl service;

    @RequestMapping("/")
    public String getStockName(Model model) {
        List<Stock> listStocks = service.getStockName("ACB");
        model.addAttribute("stocks", listStocks);

        return "index";
    }

    @RequestMapping("/price")
    public String getStockPrice(Model model) {
        List<Stock> listStocks = service.getStockPrice("ACB");
        model.addAttribute("stocks", listStocks);

        return "price";
    }
}

