package Decorator1;

public class Client {
    public static void main(String[] args) {
        PizzaConstituents pizzaConstituents =
                new Chicken(new Cheese(new Cheese(new Bread())));
        System.out.println(pizzaConstituents.getPrice());
        System.out.println(pizzaConstituents.getDesc());
    }
}
