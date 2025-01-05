package Decorator1;

import Decorator.IceCreamConstituents;

public class Cheese implements PizzaConstituents{
    private PizzaConstituents pizzaConstituents;
    public Cheese(PizzaConstituents pizzaConstituents){
        if(pizzaConstituents==null){
            throw new IllegalArgumentException("N0 cheese without bread");
        }
        this.pizzaConstituents=pizzaConstituents;
    }
    @Override
    public int getPrice() {
        return pizzaConstituents.getPrice()+20;
    }

    @Override
    public String getDesc() {
        return pizzaConstituents.getDesc()+"Cheese+";
    }
}
