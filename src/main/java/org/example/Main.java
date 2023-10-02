package org.example;


public class Main {
    public static void main(String[] args) {
        /*
        todo:
        Create an e-commerce system
        1. Create an entity named Product with attributes id, name price
        2. Create an entity named Cart where products will be kept
        3. Create an entity named Order with attributes orderId, products, status
        4. Create methods to add and remove products from cart
        5. Get status of each order
        6. Make test cases
        * */

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