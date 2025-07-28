package services;

import models.Ticket;
import repository.TicketRepository;

public class TicketService {
	
	TicketRepository ticketRepository;

	public Ticket issueTicket() {
		Ticket ticket = new Ticket();
		ticketRepository.save(ticket);
		return ticket;
	}

}
