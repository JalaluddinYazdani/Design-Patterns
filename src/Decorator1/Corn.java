package Decorator1;

public class Corn implements PizzaConstituents{
    private PizzaConstituents pizzaConstituents;
    public Corn(PizzaConstituents pizzaConstituents){
        if(pizzaConstituents==null){
            throw new IllegalArgumentException("No corn without bread");
        }
        this.pizzaConstituents=pizzaConstituents;
    }
    @Override
    public int getPrice() {
        return pizzaConstituents.getPrice()+40;
    }

    @Override
    public String getDesc() {
        return pizzaConstituents.getDesc()+"Corn+";
    }
}
