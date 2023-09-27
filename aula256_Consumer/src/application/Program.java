package application;

import entities.Product;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HDCase", 80.90));


        /* Implementação da interface */
        //list.forEach(new PriceUpdate());

        /* Reference method com método estático */
        //list.forEach(Product::staticPriceUpdate);

        /* Reference method com método não estático */
        //list.forEach(Product::nonstaticPriceUpdate);

        /* Expressão lambda declarada */
        //Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);
        //list.forEach(cons);

        /* Expressão lambda inline */
        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

        list.forEach(System.out::println);
    }
}
