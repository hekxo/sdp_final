package Strategy_Purchasing_Ticket;

public class FlightTicket {
    private SelectingTicketClassStrategy ticketClassStrategy;

    public void setTicketClassStrategy(SelectingTicketClassStrategy ticketClassStrategy) {
        this.ticketClassStrategy = ticketClassStrategy;
    }

    public void selectTicketClass() {
        if (ticketClassStrategy != null) {
            ticketClassStrategy.selectTicketClass();
        } else {
            System.out.println("No purchasing strategy set.");
        }
    }
}
