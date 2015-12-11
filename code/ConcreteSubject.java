package MockObserver;

import java.util.ArrayList;

/**
 * Created by Marshall on 12/9/2015.
 */
public class ConcreteSubject implements Subject {

    private String subjectType;
    private ArrayList<Observer> observers;

    public ConcreteSubject() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer observer) {
        System.out.println("register observer");
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        System.out.println("unregister observer");
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers) {
            observer.update(this.getType());
        }
    }

    public void setType(String type) {
        this.subjectType = type;
        notifyObserver();
    }

    public String getType() {
        return subjectType;
    }
}
