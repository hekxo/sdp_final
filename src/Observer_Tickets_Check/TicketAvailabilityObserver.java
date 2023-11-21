package Observer_Tickets_Check;

public interface TicketAvailabilityObserver {
    void update(String date, boolean isAvailable);
}
