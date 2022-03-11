package objects;

import interfaces.ICamera;
import interfaces.IGPS;
import interfaces.IRadio;
import interfaces.ISimCart;

public class SmartPhone implements IGPS,ICamera, IRadio, ISimCart,{


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
}
