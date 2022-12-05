class HondaFit extends Vehicle {

   String color;

   HondaFit(String _color) {
      super("HondaFit");
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
      return "1.5L i-DSI 4 Cylinder";
   }

   String getTransmission( ) {
      return "manual";
   }

   int getNumPassengers( ) {
      return 5;
   }

   String getWarranty( ) {
      return "3/36,000 + 5/60,000 Powertrain";
   }
}
