package Decorator;

public class ChocolateCone implements IceCreamConstituents{
    private IceCreamConstituents iceCreamConstituents;
    public ChocolateCone(){}
    @Override
    public int getPrice() {
        if(iceCreamConstituents!=null){
            return iceCreamConstituents.getPrice()+10;
        }
        return 10;
    }

    @Override
    public String getDesc() {
        if(iceCreamConstituents!=null){
            return iceCreamConstituents.getDesc()+"Chocolate Cone";
        }
        return "Chocolate Cone";
    }
}
