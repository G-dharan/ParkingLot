package repository;

import java.util.HashMap;

import models.Ticket;

public class TicketRepository {
	
	HashMap<String, Ticket> idToTicket = new HashMap();

	public void save(Ticket ticket) {
		// TODO Auto-generated method stub
		idToTicket.put(ticket.getTicketId(), ticket);
	}

}
