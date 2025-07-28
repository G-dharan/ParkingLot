package models;

import java.util.List;

public class ParkingFloor extends BaseModel {
	private int floorNum;
	private List<ParkingSpot> parkingSpots;
	private FloorStatus floorStatus;
}
