package oop;

public class Product {
    private String name;
    private Double price;
    private int rating;


    public Product(String name, Double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }


    public Double getPrice() {
        return price;
    }


    public int getRating() {
        return rating;
    }







}