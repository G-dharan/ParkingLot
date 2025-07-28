package controller;

import dto.IssueTicketRequestDto;
import dto.IssueTicketResponseDto;
import services.TicketService;

public class TicketController {
	TicketService service;
	public IssueTicketResponseDto issueTicket(IssueTicketRequestDto issueTicketRequestDto) {
		return new IssueTicketResponseDto(service.issueTicket());
	}
}
