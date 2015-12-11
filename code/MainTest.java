package MockObserver;

/**
 * Created by Marshall on 12/9/2015.
 */
public class MainTest {

    public static void main(String[] args) {
        DecafCheckBox decafCheckBox = new DecafCheckBox();
        DecafPrice decafPrice = new DecafPrice(decafCheckBox);

        decafCheckBox.setType("1/2"); // Has to be "Yes", "No", "1/2"
    }
}
