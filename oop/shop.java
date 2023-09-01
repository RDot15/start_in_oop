package oop;

import java.util.ArrayList;

public class shop {
    public static void main(String[] args) {
//
//        Product product = new Product();
//        Category1 category = new Category1();
//        Buyer buyer = new Buyer();
//        Basket basket = new Basket();
        magazinne shop = new magazinne();

        Category1 category1 = new Category1("Продукты");

        category1.addProduct(new Product("Хлеб", 40.0, 5));
        category1.addProduct(new Product("Лимонад", 60.0, 4));
        category1.addProduct(new Product("Колбаса", 300.0, 5));

        Category1 category2 = new Category1("Одежда");

        category2.addProduct(new Product("штаны", 2200.0, 3));
        category2.addProduct(new Product("кросовки", 5000.0, 4));
        category2.addProduct(new Product("майка", 1000.0, 5));

        shop.addCategory(category1);
        shop.addCategory(category2);

        shop.printCatalog();

Buyer user1 = new Buyer("Семен", "727");
        Buyer user2 = new Buyer("Петр", "366");

        user1.getBasket().addProduct(category1.getProducts().get(0));
        category1.getProducts().remove(0);

        user1.getBasket().addProduct(category1.getProducts().get(0));
        user1.getBasket().removeProduct(category1.getProducts().get(0));

        user1.getBasket().addProduct(category1.getProducts().get(1));
        category1.getProducts().remove(1);



        user2.getBasket().addProduct(category2.getProducts().get(2));
        category2.getProducts().remove(2);

        System.out.println("User login: " +user1.getLogin() + ", " + "user password: " + user1.getPassword() + "\nBasket:");
        ArrayList<Product> user1Products = user1.getBasket().getProducts();
        for (Product product : user1Products) {
            System.out.println(product.getName() + " - " + "price: " + product.getPrice() + ", " + "rating: " + product.getRating() + ";");
        }
        System.out.println();

        System.out.println("User login: " +user2.getLogin() + ", " + "user password: " + user2.getPassword() + "\nBasket:");
        ArrayList<Product> user2Products = user2.getBasket().getProducts();
        for (Product product : user2Products) {
            System.out.println(product.getName() + " - " + "price: " + product.getPrice() + ", " + "rating: " + product.getRating() + ";");
        }
        System.out.println();

        shop.printCatalog();





    }
}
