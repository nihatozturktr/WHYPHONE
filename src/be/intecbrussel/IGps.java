package be.intecbrussel;

public interface IGps {

    default String  Locate (double a, double  b){
       return "Gent";
    }

     default void navigate(){

    }



}
