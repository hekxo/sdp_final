package Observer_Tickets_Check;

public interface TicketAvailabilitySubject {
    void registerObserver(TicketAvailabilityObserver observer);
    void removeObserver(TicketAvailabilityObserver observer);
    void notifyObservers(String date);
}
