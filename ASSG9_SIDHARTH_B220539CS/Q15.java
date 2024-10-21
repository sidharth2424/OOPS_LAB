import java.util.*;
import java.util.stream.Collectors;

class Customer {
    String name;
    String fruitBought;

    public Customer(String name, String fruitBought) {
        this.name = name;
        this.fruitBought = fruitBought;
    }

    public String getFruitBought() {
        return fruitBought;
    }
}

class Fruit {
    String name;
    double pricePerKg;

    public Fruit(String name, double pricePerKg) {
        this.name = name;
        this.pricePerKg = pricePerKg;
    }

    public String getName() {
        return name;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }
}

public class Q15{

    public static void main(String[] args) {
        // List of customers who bought fruits
        List<Customer> customers = Arrays.asList(
                new Customer("Alice", "Apple"),
                new Customer("Bob", "Banana"),
                new Customer("Charlie", "Apple"),
                new Customer("Dave", "Orange"),
                new Customer("Eve", "Banana")
        );

       
        List<Fruit> fruits = Arrays.asList(
                new Fruit("Apple", 100),
                new Fruit("Banana", 50),
                new Fruit("Orange", 80)
        );

        
        Map<String, Double> fruitPriceMap = fruits.stream()
                .collect(Collectors.toMap(Fruit::getName, Fruit::getPricePerKg));

       
        Map<String, Long> fruitCount = customers.stream()
                .collect(Collectors.groupingBy(Customer::getFruitBought, Collectors.counting()));

        Map<String, Double> totalSales = fruitCount.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue() * fruitPriceMap.get(entry.getKey())
                ));

        
        totalSales.forEach((fruit, totalAmount) ->
                System.out.println(fruit + ": Rs " + totalAmount));
    }
}
