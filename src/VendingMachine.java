import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VendingMachine {

    private List<Product> productList;
    private static List<Product> deflt = new ArrayList<>(Arrays.asList(new Product("Святой источник", 50)));

    public VendingMachine(List<Product> productList) {
        this.productList = productList;
    }

    public VendingMachine() {
        this(deflt);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        productList.forEach(i -> result.append(i.toString() + "\n"));
        return result.toString();
    }
}