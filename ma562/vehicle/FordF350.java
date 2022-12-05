class FordF350 extends Vehicle {

   String color;

   FordF350(String _color) {
      super("Ford F350");
      color = _color;
      System.out.println(" built");
   }

   String getModel( ) { 
      return model;
   }

   String getColor( ) { 
      return color;
   }

   String getEngine( ) {
      return "7.3L V8";
   }

   String getTransmission( ) {
      return "10 speed automatic";
   }

   int getNumPassengers( ) {
      return 3;
   }

   String getWarranty( ) {
      return "3/36,000 + 5/60,000 Powertrain";
   } 
}
