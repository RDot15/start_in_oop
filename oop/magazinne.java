package oop;
import java.util.ArrayList;
public class magazinne {

    private ArrayList<Category1> categories;

    public magazinne() {
        this.categories = new ArrayList<>();
    }

    public void addCategory(Category1 category) {
        categories.add(category);
    }


   //Метод вывода в консоль каталога товаров

    public void printCatalog() {
        System.out.println("SHOP direfctory: ");
        for (Category1 category : categories) {
            System.out.println("Category: " + category.getName());
            ArrayList<Product> products = category.getProducts();

            for (Product product : products) {
                System.out.println(product.getName() + " - " + "price: " + product.getPrice() + ", " + "rating: " + product.getRating() + ";");
            }
        }
        System.out.println();
    }
}

