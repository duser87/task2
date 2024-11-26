package ru.innopolis;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Product> products = new ArrayList<Product>();

        products.add(new Product(1, "This is the No.1 product", 100L, 20L));

        products.add(new Product(2, "This is the No.2 product", 10L, 30L));

        products.add(new Product(3, "This is the No.3 product", 20L, 40L));

        for(Product p: products){

            System.out.println(p.toString());

        }

    }
}