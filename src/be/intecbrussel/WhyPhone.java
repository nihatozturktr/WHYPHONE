package be.intecbrussel;

public class WhyPhone extends SmartPhone{

    final private String color =null;

    public WhyPhone(double price, String brand) {
        super(price, brand);
    }

    public static void main(String[] args) {
        Whyphone phone = new WhyPhone(1200,"Samsung");
    }
}
