package observer;

import notification.Order;

public class TextMessage implements Observer{

    @Override
    public void update(Order order) {
        System.out.println("Zaktualizowano TextMessage. Obecny status to: " + order.getOrderStatus() );
    }
}
