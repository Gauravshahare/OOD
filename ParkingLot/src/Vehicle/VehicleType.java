package Vehicle;

public enum VehicleType {
    MOTORCYCLE(1),COMPACT(2),MEDIUM(3),LARGE(4);

    public int getNoOfParkingSpotRequired() {
        return noOfParkingSpotRequired;
    }

    private final int noOfParkingSpotRequired;


    private VehicleType(int noOfParkingSpotRequired){
        this.noOfParkingSpotRequired=noOfParkingSpotRequired;
    }
}
