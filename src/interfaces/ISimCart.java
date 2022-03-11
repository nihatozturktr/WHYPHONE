package interfaces;

public interface ISimCart {

    default void startCall(String number){
        System.out.printf("Calling " + number );
    }

    default  void endCall(){
        System.out.println("Call ended");
    }
}
