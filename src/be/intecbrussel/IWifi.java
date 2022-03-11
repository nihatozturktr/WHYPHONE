package be.intecbrussel;

public interface IWifi {

     default String connect(){

         return " network connected";

    }
    default String disconnected(){

         return "network disconnected";
    }
}
