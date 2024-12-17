package Decorator;

public class ChocoChips implements IceCreamConstituents{
    private IceCreamConstituents iceCreamConstituents;

    public ChocoChips(IceCreamConstituents iceCreamConstituents){
        if(iceCreamConstituents==null){
            throw new IllegalArgumentException("NO chocochips without cone");
        }
        this.iceCreamConstituents=iceCreamConstituents;
    }

    @Override
    public int getPrice() {
        return iceCreamConstituents.getPrice()+40;
    }

    @Override
    public String getDesc() {
        return iceCreamConstituents.getDesc()+"ChocoChips";
    }
}
