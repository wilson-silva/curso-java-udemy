package application;

import entities.Product;
import util.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("Mouse Pad", 80.90));

        ProductService ps = new ProductService();

        double sumT = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
        System.out.println("Sum products that start with the letter T = " + String.format("%.2f", sumT));

        double sumM = ps.filteredSum(list, p -> p.getName().charAt(0) == 'M');
        System.out.println("Sum products that start with the letter M = " + String.format("%.2f", sumM));

        double sumLessThan100 = ps.filteredSum(list, p -> p.getPrice() < 100);
        System.out.println("Sum the products that are less than 100 = " + String.format("%.2f", sumLessThan100));

    }
}
