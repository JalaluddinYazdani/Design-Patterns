package Decorator;

public class Client {
    public static void main(String[] args) {
        IceCreamConstituents iceCreamConstituents
                = new ChocoChips(new MangoScoop(new ChocolateCone()));

        System.out.println(iceCreamConstituents.getPrice());
        System.out.println(iceCreamConstituents.getDesc());
    }
}
