import java.util.ArrayList;
import java.util.List;

public class hw1 {
    public static void main(String[] args) {

        VendingMachine boxOne = new VendingMachine();
        System.out.println(boxOne);

        Product water = new Product("BonAqua", 100);

        List<Product> boxTwoGoods = new ArrayList<>();
        boxTwoGoods.add(water);
        boxTwoGoods.add(new Product("CocaCola", 120));
        boxTwoGoods.add(new Nuts("орехи 'Сладкий мир'", 75, "кешью"));
        boxTwoGoods.add(new Milk("молоко 'Чудо'", 45, "клубничный", 0.2));
        boxTwoGoods.add(new Milk("молоко 'Чудо'", 45, "ванильный", 0.2));

        VendingMachine boxTwo = new VendingMachine(boxTwoGoods);
        System.out.println(boxTwo);
    }
}