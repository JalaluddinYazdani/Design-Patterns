package Stratergy;

public class GoogleMaps {
    public void findPath(String from,String to,String mode){
        PathCalculator pathCalculator = PathCalculatorFactory.getForPCMode(mode);
        pathCalculator.findPath(from,to);

    }
}
