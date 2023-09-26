package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HDCase", 80.90));

        double min = 100.0;
        list.removeIf(p -> p.getPrice() >= min);

        //list.removeIf(Product::nonStaticProductPredicate);
        //list.removeIf(Product::staticProductPredicate);
        //list.removeIf(new ProductPredicate());

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
