package Decorator1;

public class Chicken implements PizzaConstituents{
    private PizzaConstituents pizzaConstituents;
    public Chicken(PizzaConstituents pizzaConstituents){
        if(pizzaConstituents==null){
            throw new IllegalArgumentException("Chicken cant be added without bread");
        }
        this.pizzaConstituents=pizzaConstituents;
    }
    @Override
    public int getPrice() {
        return pizzaConstituents.getPrice()+30;
    }

    @Override
    public String getDesc() {
        return pizzaConstituents.getDesc()+"Chicken+";
    }
}
