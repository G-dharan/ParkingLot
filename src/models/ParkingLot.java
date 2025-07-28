package models;

import java.util.List;

public class ParkingLot extends BaseModel {
	private List<Gate> gates;
	private ParkingLotStatus parkingLotStatus;
	private List<ParkingFloor> parkingFloors;
	private List<VehicleType> supportedVehicles;
	
	
}
