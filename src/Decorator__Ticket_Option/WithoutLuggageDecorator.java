package Decorator__Ticket_Option;

public class WithoutLuggageDecorator extends TicketDecorator {

    public WithoutLuggageDecorator(FlightTicketComponent decoratedTicket) {
        super(decoratedTicket);
    }

    @Override
    public void purchaseTicket() {
        System.out.println("Ticket without luggage option selected.");
        super.purchaseTicket();
    }
}
