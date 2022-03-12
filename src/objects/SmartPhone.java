package objects;

import interfaces.*;

public class SmartPhone implements IWifi,IGPS,ISimCart,ICamera, IRadio {

    private final double PRICE;

    public int getNumberOfPhotos() {
        return numberOfPhotos;
    }

    private final String BRANDS;

    public SmartPhone(double PRICE, String BRANDS, int numberOfPhotos) {
        this.PRICE = PRICE;
        this.BRANDS = BRANDS;
        this.numberOfPhotos = numberOfPhotos;
    }

    private int numberOfPhotos;

    public double getPRICE() {
        return PRICE;
    }

    public String getBRANDS() {
        return BRANDS;
    }




    @Override
    public void shootAPhoto(double amountOfPhotos) {

        System.out.println("Shot "+ amountOfPhotos+ " photos.");
        numberOfPhotos+=amountOfPhotos;// same as numberOfPhotos = numberOfPhotos + amountOfPhotos

    }

    @Override
    public String[] viewPhotos() {

        String [] photos = new String[numberOfPhotos];
        for (int i = 0; i<photos.length; i++){
            photos[i]= "Photo"+i+".jpg";
        }

        return photos;
    }

    @Override
    public String Locate(double latitude, double longtitude) {
        return " going to   " + latitude+ " and "+longtitude;
    }


    @Override
    public void navigate() {
        System.out.println("navigating");

    }

    @Override
    public void playChannel(double fm) {
        System.out.println("Playing music free "+ "FM.");

    }

    @Override
    public void changeChannel(double fm) {
        System.out.println("Changed  chaneel to "+ fm +"FM.");

    }

    @Override
    public void connect(String internetConnection) {
        System.out.println("Connectin to "+ internetConnection);

    }

    @Override
    public void disconnect(String internetConnection) {
        System.out.println("Disconnecting to "+ internetConnection);

    }
}
