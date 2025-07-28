package dto;

public class IssueTicketRequestDto {
	private long gateId;
	private String vehicleNum;


	private String ownerName;
	private String ownerContact;
	private String ownerEmail;
	
	public IssueTicketRequestDto(){
		
	}

	public long getGateId() {
		return gateId;
	}

	public void setGateId(long gateId) {
		this.gateId = gateId;
	}

	public String getVehicleNum() {
		return vehicleNum;
	}

	public void setVehicleNum(String vehicleNum) {
		this.vehicleNum = vehicleNum;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerContact() {
		return ownerContact;
	}

	public void setOwnerContact(String ownerContact) {
		this.ownerContact = ownerContact;
	}

	public String getOwnerEmail() {
		return ownerEmail;
	}

	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}
	
	
	
}
