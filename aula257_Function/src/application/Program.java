package application;

import entities.Product;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HDCase", 80.90));


        /* Implementação da interface */
        //List<String> collect = list.stream().map(new UpperCaseName()).toList();

        /* Reference method com método estático */
        //List<String> collect = list.stream().map(Product::staticUpperCaseName).toList();

        /* Reference method com método não estático */
        //List<String> collect = list.stream().map(Product::nonstaticUpperCaseName).toList();

        /* Expressão lambda declarada */
        //Function<Product, String> func = p -> p.getName().toUpperCase();
        //List<String> collect = list.stream().map(func).toList();

        /* Expressão lambda inline */
        List<String> collect = list.stream().map(p -> p.getName().toUpperCase()).toList();

        list.forEach(System.out::println);
        System.out.println("-----------------");
        collect.forEach(System.out::println);
    }
}
