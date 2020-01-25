import notification.Observable;
import notification.Order;
import notification.OrderStatus;
import observer.EmailMessage;
import observer.MobileApp;
import observer.Observer;
import observer.TextMessage;

public class Main {

    public static void main(String[] args) {
        Observer mobileApp = new MobileApp();
        Observer textMessage = new TextMessage();
        Observer emailMessage = new EmailMessage();

        Observable order = new Order(1, OrderStatus.GOTOWE_DO_WYSYLKI);
        order.registerObserver(mobileApp);
        order.registerObserver(textMessage);
        order.registerObserver(emailMessage);

        order.changeOrderStatus(OrderStatus.WYSLANE);
        order.changeOrderStatus(OrderStatus.ZREALIZOWANE);
        order.unregisterObserver(mobileApp);
        order.changeOrderStatus(OrderStatus.GOTOWE_DO_WYSYLKI);
    }
}
