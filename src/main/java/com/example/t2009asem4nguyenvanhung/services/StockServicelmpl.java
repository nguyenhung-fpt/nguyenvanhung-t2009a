package com.example.t2009asem4nguyenvanhung.services;

import com.example.t2009asem4nguyenvanhung.entity.Stock;
import com.example.t2009asem4nguyenvanhung.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServicelmpl implements StockService {

    @Autowired
    StockRepository repo;

    @Override
    public List<Stock> getStockName(String symbol) {
        return repo.findNameBySymbol(symbol);
    }

    @Override
    public List<Stock> getStockPrice(String symbol) {
        return repo.findPriceBySymbol(symbol);
    }
}
