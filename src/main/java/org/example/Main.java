package org.example;


public class Main {
    public static void main(String[] args) {
        //Creating a cart to keep products
        Cart cart = new Cart();

        //Adding products to a cart
        Product product1 = new Product(1, "Cheese", 50.0);
        Product product2 = new Product(2, "Cereal", 80.0);
        Product product3 = new Product(3, "Tea", 100.00);
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        //Showing cart before removing products
        System.out.println("Cart before changes: ");
        cart.showCart();
        System.out.println("\n");

        //Removing products from cart
        cart.removeProduct(product1);
        cart.removeProduct(product3);

        //Showing cart after removing products
        System.out.println("Cart after changes: ");
        cart.showCart();
        System.out.println("\n");

        //Making an order
        Order order = new Order(1, cart.getCart());
        order.placeOrder();
        System.out.println("Status: " + order.getStatus());
    }
}
