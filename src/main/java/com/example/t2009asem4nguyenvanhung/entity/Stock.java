package com.example.t2009asem4nguyenvanhung.entity;

import javax.persistence.*;

@Entity
@Table(name = "stocks")
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "symbol", nullable = false)
    private String symbol;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price", nullable = false)
    private String price;

    public Stock(Integer id, String symbol, String name, String price) {
        this.id = id;
        this.symbol = symbol;
        this.name = name;
        this.price = price;
    }

    public Stock() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}