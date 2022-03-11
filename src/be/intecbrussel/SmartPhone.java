package be.intecbrussel;

public class SmartPhone {
   private final  double price;
   final  String brand;

   public double getPrice() {
      return price;
   }

   public String getBrand() {
      return brand;
   }

   public SmartPhone(double price, String brand) {
      this.price = price;
      this.brand = brand;
   }

}
