package objects;

import interfaces.*;

public class SmartPhone implements IWifi,IGPS,ISimCart,ICamera, IRadio {

    private final double PRICE;
    private final String BRANDS;








    @Override
    public void shootAPhoto(double amountOfPhotos) {

    }

    @Override
    public String[] viewPhotos() {
        return new String[0];
    }

    @Override
    public String Locate(double latitude, double longtitude) {
        return null;
    }

    @Override
    public void navigate() {

    }

    @Override
    public void playChannel(double fm) {

    }

    @Override
    public void changeChannel(double fm) {

    }

    @Override
    public void connect(String internetConnection) {

    }

    @Override
    public void disconnect(String internetConnction) {

    }
}
