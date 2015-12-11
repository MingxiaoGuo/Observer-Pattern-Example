package MockObserver;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Marshall on 12/9/2015.
 */
public class DecafPrice extends ConcreteObserver {

    Map<String, Double> priceMap = new HashMap<String, Double>();


    public DecafPrice(ConcreteSubject subject) {
        super(subject);
        priceMap.put("No", 0.0);
        priceMap.put("Yes", 0.5);
        priceMap.put("1/2", 0.25);
    }

    public void update(String type) {
        setPrice(type);
    }

    public void setPrice(String type) {
        double price = priceMap.get(type);
        type = "Decaf " + type;
        super.setPrice(price, type);
    }
}
