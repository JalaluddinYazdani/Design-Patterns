package Stratergy;

public class PathCalculatorFactory {
    public static PathCalculator getForPCMode(String mode){
        if(mode.equals("Bike")){
            return new BikePathCalculator();
        }else if(mode.equals("Car")){
            return new CarPathCalculator();
        }else{
            throw new IllegalArgumentException("No mode exists");
        }
    }
}
