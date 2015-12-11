package MockObserver;

/**
 * Created by Marshall on 12/9/2015.
 */
public interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObserver();
}
