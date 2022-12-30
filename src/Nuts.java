public class Nuts extends Product{
    public Nuts(String name, double price, String nutType) {

        super(name, price);
        this.setType(nutType);
    }
    private String nutType;

    private void setType(String nutType){

        this.nutType = nutType;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", nutType , super.toString());
    }
}
