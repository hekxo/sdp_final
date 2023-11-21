package Decorator__Ticket_Option;

abstract class TicketDecorator implements FlightTicketComponent {
    private FlightTicketComponent decoratedTicket;

    public TicketDecorator(FlightTicketComponent decoratedTicket) {
        this.decoratedTicket = decoratedTicket;
    }

    @Override
    public void purchaseTicket() {
        decoratedTicket.purchaseTicket();
    }
}
