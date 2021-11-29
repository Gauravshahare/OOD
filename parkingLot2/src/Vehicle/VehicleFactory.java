package Vehicle;

public class VehicleFactory {
    public static Vehicle createVehicle(VehicleType vehicleType,String vehicleNumber){
        switch (vehicleType){
            case MOTORCYCLE:
                return new MotorCycleVehicle(vehicleNumber);
            case COMPACT:
                return new CompactVehicleType(vehicleNumber);
            case MEDIUM:
                return new MediumVehicleType(vehicleNumber);
            case LARGE:
                return new LargeVehicleType(vehicleNumber);
            default:
                return null;
        }
    }
}
