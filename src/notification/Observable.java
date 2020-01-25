package notification;

import observer.Observer;

public interface Observable {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
    void changeOrderStatus(OrderStatus orderStatus);
}
