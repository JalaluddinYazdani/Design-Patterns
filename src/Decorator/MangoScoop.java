package Decorator;

public class MangoScoop implements IceCreamConstituents{
    private IceCreamConstituents iceCreamConstituents;

    public MangoScoop(IceCreamConstituents iceCreamConstituents){
        if(iceCreamConstituents==null){
            throw new IllegalArgumentException("no Mango Scoop without cone");
        }
        this.iceCreamConstituents=iceCreamConstituents;
    }
    @Override
    public int getPrice() {
        return iceCreamConstituents.getPrice()+20;
    }

    @Override
    public String getDesc() {
        return iceCreamConstituents.getDesc()+"MangoScoop";
    }
}
