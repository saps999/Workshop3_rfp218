package com.bridgrlabz;

import java.util.Scanner;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product1 = new Product(1, "Maggie", 5, 10.0);
        Product product2 = new Product(2, "Dairy-Milk", 5, 40.0);
        Product product3 = new Product(3, "Cornato Ice-Cream", 5, 55.0);
        Product product4 = new Product(4, "Lays", 5, 20.0);
        Product product5 = new Product(5, "Thumbs-Up", 5, 40.0);

        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);
        shoppingCart.addProduct(product3);
        shoppingCart.addProduct(product4);
        shoppingCart.addProduct(product5);

        shoppingCart.printProductList();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println("\n----------Menu----------");
            System.out.println("Press 1 to add Maggie to your cart.");
            System.out.println("Press 2 to add Dairy-Milk to your cart.");
            System.out.println("Press 3 to add Cornato Ice-Cream to your cart.");
            System.out.println("Press 4 to add Lays to your cart.");
            System.out.println("Press 5 to add Thumbs-Up to your cart.");
            System.out.println("Press 6 to Show Cart.");
            System.out.println("Press 7 to Remove Item.");
            System.out.println("Press 8 to Exit.");
            System.out.println("Select an option: ");

            choice = sc.nextInt();
            if (choice < 1 || choice > 8) {
                System.out.println("Enter between 1 to 8.");
            } else {
                switch (choice) {
                    case 1:
                        shoppingCart.addToCart(product1);
                        break;
                    case 2:
                        shoppingCart.addToCart(product2);
                        break;
                    case 3:
                        shoppingCart.addToCart(product3);
                        break;
                    case 4:
                        shoppingCart.addToCart(product4);
                        break;
                    case 5:
                        shoppingCart.addToCart(product5);
                        break;
                    case 6:
                        shoppingCart.printCartList();
                        break;
                    case 7:
                        shoppingCart.removeItem();
                        break;
                    case 8:
                        keepGoing = false;
                        System.out.println("Thanks for visiting. Have a Good Day!!!");
                        break;
                }
            }
        }
    }
}
