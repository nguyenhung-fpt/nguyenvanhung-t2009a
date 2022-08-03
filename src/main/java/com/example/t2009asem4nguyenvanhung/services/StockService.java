package com.example.t2009asem4nguyenvanhung.services;

import com.example.t2009asem4nguyenvanhung.entity.Stock;

import java.util.List;

public interface StockService {
    List<Stock> getStockName(String symbol);
    List<Stock> getStockPrice(String symbol);
}
