package com.karan.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "bk")
public class Book {
    @Value("B1")
    private String bid;
    @Value("Core Java")
    private String bname;
    @Value(value = "1000.00")
    private double price;

    public Book() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Book(String bid, String bname, double price) {
        super();
        this.bid = bid;
        this.bname = bname;
        this.price = price;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [bid=" + bid + ", bname=" + bname + ", price=" + price + "]";
    }

}
