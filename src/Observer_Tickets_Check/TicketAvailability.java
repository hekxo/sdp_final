package Observer_Tickets_Check;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TicketAvailability implements TicketAvailabilitySubject {
    private Map<String, Boolean> availabilityByDate = new HashMap<>();
    private List<TicketAvailabilityObserver> subscribers = new ArrayList<>();

    public void setTicketAvailabilityByDate(String date, boolean isAvailable) {
        availabilityByDate.put(date, isAvailable);
        notifyObservers(date);
    }

    @Override
    public void registerObserver(TicketAvailabilityObserver observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(TicketAvailabilityObserver observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers(String date) {
        for (TicketAvailabilityObserver observer : subscribers) {
            observer.update(date, availabilityByDate.get(date));
        }
    }
}
