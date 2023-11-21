package Decorator__Ticket_Option;

public class WithRefundDecorator extends TicketDecorator {

    public WithRefundDecorator(FlightTicketComponent decoratedTicket) {
        super(decoratedTicket);
    }

    @Override
    public void purchaseTicket() {
        System.out.println("Ticket with refund option selected.");
        super.purchaseTicket();
    }
}
