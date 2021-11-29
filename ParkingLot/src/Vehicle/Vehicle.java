package Vehicle;

public abstract class Vehicle {
     private VehicleType vehicleType;
     private String vehicleNumber;

     protected Vehicle(VehicleType vehicleType, String vehicleNumber) {
          this.vehicleType = vehicleType;
          this.vehicleNumber = vehicleNumber;
     }

     public VehicleType getVehicleType(){
          return  this.vehicleType;
     }
     public String getVehicleNumber(){
          return this.vehicleNumber;
     }

     @Override
     public String toString() {
          return "Vehicle{" +
                  "vehicleType=" + vehicleType +
                  ", vehicleNumber='" + vehicleNumber + '\'' +
                  '}';
     }
}
