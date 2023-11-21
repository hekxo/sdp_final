package Observer_Tickets_Check;

public class Passenger implements TicketAvailabilityObserver {
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    @Override
    public void update(String date, boolean isAvailable) {
        if (isAvailable) {
            System.out.println(name + ": Tickets for " + date + " are now available!");
        } else {
            System.out.println(name + ": No tickets available for " + date + " at the moment.");
        }
    }
}
