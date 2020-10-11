package Controller;

import model.Product;

public class Main {

    public static void main(String[] args) {

        //Creating new products
        Product product1 = new Product("I Phone 11",69990);
        Product product2 = new Product("I Phone 11",69990);
        Product product3 = new Product("Nike shoes",6999);

        //Printing of products
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);

        //Printing equality of the products
        System.out.println(product1.equals(product2));
        System.out.println(product2.equals(product3));

        //Creating object of SpecialProduct class
        SpecialProduct specialProduct = SpecialProduct.applyOffOnProduct(product1,20);

        //Printing the "Special Product" after discount.
        System.out.println(specialProduct);

    }
}
