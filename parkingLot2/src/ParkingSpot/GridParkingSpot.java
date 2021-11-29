package ParkingSpot;

public class GridParkingSpot implements ParkingSpot {
    private String parkingSpotId;
    private int xCoordinate;
    private int yCoordinate;

    public GridParkingSpot(String parkingSpotId, int xCoordinate, int yCoordinate) {
        this.parkingSpotId = parkingSpotId;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }
    public GridParkingSpot(){

    }

    @Override
    public String getParkingSpotId() {
        return this.parkingSpotId;
    }

    @Override
    public double getParkingSpotDistanceFromCounter(int x, int y) {
        return Math.sqrt((x-this.xCoordinate)*(x-this.xCoordinate) + (y-this.yCoordinate)*(y-this.yCoordinate));
    }

    @Override
    public String toString() {
        return "GridParkingSpot{" +
                "parkingSpotId='" + parkingSpotId + '\'' +
                ", xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                '}';
    }
}
