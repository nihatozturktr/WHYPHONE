package be.intecbrussel;

public interface ISimCard {
    default void startCall(String OperatorName) {
        System.out.println("Calling 911");

    }

    default void endCall(){

        System.out.println(" Call Ended");
    }

}
