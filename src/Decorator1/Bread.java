package Decorator1;

public class Bread implements PizzaConstituents{
    private PizzaConstituents pizzaConstituents;
    public Bread(){}
    @Override
    public int getPrice() {
        if(pizzaConstituents!=null){
            return pizzaConstituents.getPrice()+10;
        }
        return 10;
    }

    @Override
    public String getDesc() {
        if(pizzaConstituents!=null){
            return pizzaConstituents.getDesc()+"Bread+";
        }
        return "Bread+";
    }
}
