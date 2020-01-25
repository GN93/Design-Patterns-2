package notification;

import observer.Observer;

import java.util.HashSet;
import java.util.Set;

public class Order implements Observable {

    private Set<Observer> observers = new HashSet<>();
    private OrderStatus orderStatus;
    private int orderId;

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public Order(int orderId, OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
        this.orderId = orderId;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void changeOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        observers.forEach( observer -> observer.update(this));
    }
}
