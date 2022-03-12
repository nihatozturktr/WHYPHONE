package apps;

import objects.SmartPhone;
import objects.WhyPhone;

public class WhyPhoneApp {
    public static void main(String[] args) {

        WhyPhone phone = new WhyPhone(799.9,"Iphone","Black");


        showSpecs(phone);

    }

    public static void showSpecs(SmartPhone phone){
        phone.connect("pearWifi");
        phone.locate(52.6, 32.9);
        phone.shootAPhoto(4);
        String [] photos =phone.viewPhotos();
        for(String photo:photos){
            System.out.println(photo);
        }

        phone.startCall("0476xxxxxx");
        phone.endCall();



    }
}
