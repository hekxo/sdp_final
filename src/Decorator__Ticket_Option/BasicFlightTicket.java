package Decorator__Ticket_Option;

public class BasicFlightTicket implements FlightTicketComponent {
    @Override
    public void purchaseTicket() {
        System.out.println("Your flight ticket successfully purchased!");
    }
}
