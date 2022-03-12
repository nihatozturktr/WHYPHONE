package objects;

public class WhyPhone extends SmartPhone{


    private final String COLOR;



    public WhyPhone(double PRICE, String BRANDS,  String color) {
        super(PRICE, BRANDS);
        COLOR = color;
    }

    public String getCOLOR() {
        return COLOR;
    }
}
