package Decorator__Ticket_Option;

public class WithoutRefundDecorator extends TicketDecorator {

    public WithoutRefundDecorator(FlightTicketComponent decoratedTicket) {
        super(decoratedTicket);
    }

    @Override
    public void purchaseTicket() {
        System.out.println("Ticket without refund option selected.");
        super.purchaseTicket();
    }
}
