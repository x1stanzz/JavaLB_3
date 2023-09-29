package org.example;

import java.util.ArrayList;

public class Order {
    private int orderId;
    private ArrayList<Product> products = new ArrayList<Product>();
    private String status;

    public Order(int orderId, ArrayList<Product> products, String status){
        this.orderId = orderId;
        this.products = products;
        this.status = status;
    }

    public String getStatus(){
        return this.status;
    }
}
