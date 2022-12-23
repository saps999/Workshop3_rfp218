package com.bridgrlabz;

import java.util.ArrayList;
import java.util.Scanner;

//Write a Java program to implement a simple shopping cart using an array of items and object-oriented principles.
// The shopping cart should support the following operations: add item, remove item, and display items in the cart.
public class ShoppingCart {
    ArrayList<Product> productList = new ArrayList<>();
    ArrayList<Product> cartList = new ArrayList<>();

    public ArrayList<Product> addProduct(Product product) {
        this.productList.add(product);
        return this.productList;
    }

    public void printProductList() {
        for (Product product : this.productList) {
            System.out.println("-------------------------------");
            System.out.println("Product Id: " + product.getId());
            System.out.println("Product Name: " + product.getProductName());
            System.out.println("Product Quantity: " + product.getQuantity());
            System.out.println("Product Price: " + product.getPrice());
            System.out.println("-------------------------------");
        }
    }

    public ArrayList<Product> addToCart(Product product) {
        this.cartList.add(product);
        return this.cartList;
    }

    public void removeItem(){
        Product product=null;
        String name=null;
        Scanner sc =new Scanner(System.in);
        System.out.println("\nEnter the Name of the Product you want to remove: ");
        name=sc.next();
        while (product==null){
            for (int i=0;i<cartList.size();i++){
                Product temp =cartList.get(i);
                if (name.equalsIgnoreCase(temp.getProductName())){
                    product=temp;
                }
            }
            if (product==null){
                System.out.println("\nProduct is not in the List.");
            }
            cartList.remove(product);
        }
    }

    public void printCartList() {
        for (Product product : this.cartList) {
            System.out.println("-------------------------------");
            System.out.println("Product Id: " + product.getId());
            System.out.println("Product Name: " + product.getProductName());
            System.out.println("Product Quantity: " + product.getQuantity());
            System.out.println("Product Price: " + product.getPrice());
        }
    }
}
