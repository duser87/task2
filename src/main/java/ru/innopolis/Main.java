package ru.innopolis;


public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1, "This is the No.1 product", 100L, 20L);

        Product product2 = new Product(2, "This is the No.2 product", 5L, 30L);

        System.out.println(product1.toString());

        System.out.println(product2.toString());

    }
}