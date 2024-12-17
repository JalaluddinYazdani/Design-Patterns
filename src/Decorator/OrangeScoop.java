package Decorator;

public class OrangeScoop implements IceCreamConstituents{
    private IceCreamConstituents iceCreamConstituents;

    public OrangeScoop(IceCreamConstituents iceCreamConstituents){
        if(iceCreamConstituents==null){
            throw new IllegalArgumentException("No orangeSccop without cone");
        }
        this.iceCreamConstituents=iceCreamConstituents;
    }

    @Override
    public int getPrice() {
        return iceCreamConstituents.getPrice()+30;
    }

    @Override
    public String getDesc() {
        return iceCreamConstituents.getDesc()+"OrangeScoop";
    }
}
