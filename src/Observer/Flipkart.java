package Observer;

import java.util.LinkedList;
import java.util.List;

public class Flipkart {
    private List<OrderPlacerSub> subList = new LinkedList<>();
    private List<OrderCancelledSub> subListCan = new LinkedList<>();

    public void register(OrderPlacerSub orderPlacerSub){
        subList.add(orderPlacerSub);
    }
    public void unRegister(OrderPlacerSub orderPlacerSub){
        subList.remove(orderPlacerSub);
    }
    public void registerCancel(OrderCancelledSub orderCancelledSub){
        subListCan.add(orderCancelledSub);
    }
    public void unregisterCancel(OrderCancelledSub orderCancelledSub){
        subListCan.remove(orderCancelledSub);
    }
    public void onOrderPlaced() {
        for(OrderPlacerSub sub: subList) {
            sub.announceOrderPlaced();
        }
    }
    public void OnOrderCancel() {
        for(OrderCancelledSub sub: subListCan) {
            sub.announceCancel();
        }

    }

}
