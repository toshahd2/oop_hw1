public class Milk extends Product{
    public Milk(String name, double price, String flavour, double volume) {
        super(name, price);
        this.setFlavour(flavour);
        this.setVolume(volume);
    }
    private String flavour;
    private double volume;

    private void setFlavour(String flavour){
        this.flavour = flavour;
    }
    private void setVolume(double volume){
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("%s (%s вкус, объем: %.1f л)", super.toString(), flavour , volume);
    }
}
