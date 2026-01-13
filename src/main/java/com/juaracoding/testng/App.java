package com.juaracoding.testng;

import com.juaracoding.testng.model.Product;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Product product = new Product();
        Product productCopy = product;

        product.name = "Bayem";

        System.out.println(product.name);

        productCopy.name = "Kangkung";
        System.out.println(product.name);

    }
}
