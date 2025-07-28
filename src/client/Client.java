package client;

import controller.TicketController;
import dto.IssueTicketRequestDto;
import dto.IssueTicketResponseDto;

public class Client {
	public static void main(String[] args) {
		TicketController controller = new TicketController();
		IssueTicketRequestDto dto = new IssueTicketRequestDto();
		dto.setGateId(1);
		dto.setVehicleNum("FJ56JD5894");
		dto.setOwnerName("Hanan");
		dto.setOwnerContact("223623");
		dto.setOwnerEmail("hanan@gmail.com");
		
		
		IssueTicketResponseDto issueTicketResponseDto = controller.issueTicket(dto);
		
	}
}
