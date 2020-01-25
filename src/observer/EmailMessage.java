package observer;

import notification.Order;

public class EmailMessage implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("Zaktualizowano EmailMessage. Obecny status to: " + order.getOrderStatus());
    }
}
