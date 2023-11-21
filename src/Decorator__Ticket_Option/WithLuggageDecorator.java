package Decorator__Ticket_Option;

public class WithLuggageDecorator extends TicketDecorator {

    public WithLuggageDecorator(FlightTicketComponent decoratedTicket) {
        super(decoratedTicket);
    }

    @Override
    public void purchaseTicket() {
        System.out.println("Ticket with luggage option selected.");
        super.purchaseTicket();
    }
}
