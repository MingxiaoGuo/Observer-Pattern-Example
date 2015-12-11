package MockObserver;

/**
 * Created by Marshall on 12/9/2015.
 */
public class ConcreteObserver implements Observer {

    private ConcreteSubject subject;
    private double price;

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
        subject.register(this);
    }

    @Override
    public void update(String type) {

    }

    public void setPrice(double price, String type) {
        this.price = price;
        ShowPrice(type);
    }

    public void ShowPrice(String type) {
        System.out.println(type + "->" + price);
    }
}
