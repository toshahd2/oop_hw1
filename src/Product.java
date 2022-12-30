public class Product {
    private String name;
    private double price;

    public Product(String name, double price){
        this.setName(name);
        this.setPrice(price);
    }
    private void setName(String name){
        this.name = name;
    }
    private void setPrice(double price){
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f руб",name, price);
    }
}
