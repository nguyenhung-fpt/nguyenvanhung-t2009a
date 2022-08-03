package com.example.t2009asem4nguyenvanhung.repository;

import com.example.t2009asem4nguyenvanhung.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StockRepository extends JpaRepository<Stock, Long> {
    @Query(value = "select name from stocks where symbol like %:symbol%", nativeQuery = true)
    List<Stock> findNameBySymbol(String symbol);

    @Query(value = "select price from stocks where symbol like %:symbol%", nativeQuery = true)
    List<Stock> findPriceBySymbol(String symbol);
}
