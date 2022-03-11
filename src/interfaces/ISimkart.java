package interfaces;

import java.sql.SQLOutput;

public interface ISimkart {

    default void startCall(String number){
        System.out.printf("Calling " + number );
    }

    default  void endCall(){
        System.out.println("Call ended");
    }
}
