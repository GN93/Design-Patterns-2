package observer;

import notification.Order;

public class MobileApp implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("Zaktualizowano MobileApp. Obecny status to: " + order.getOrderStatus());
    }
}
