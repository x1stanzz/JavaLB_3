package org.example;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> cart = new ArrayList<Product>();

    public void addProduct(Product product){
        cart.add(product);
    }

    public void removeProduct(Product product){
        cart.remove(product);
    }

    public ArrayList<Product> getCart() {
        return cart;
    }
}
