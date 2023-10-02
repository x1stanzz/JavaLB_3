package org.example;

import java.util.ArrayList;

public class Order {
    private int orderId;
    private ArrayList<Product> products = new ArrayList<Product>();
    private String status = "Pending";

    public Order(int orderId, ArrayList<Product> products){
        this.orderId = orderId;
        this.products = products;
    }

    public String getStatus(){
        return this.status;
    }

    public void placeOrder(){
        if(!products.isEmpty()){
            status = "Placed";
        }
    }

}
