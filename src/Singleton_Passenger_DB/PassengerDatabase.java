package Singleton_Passenger_DB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PassengerDatabase {
    public static PassengerDatabase instance;

    private PassengerDatabase() {}

    public static PassengerDatabase getInstance() {
        if (instance == null) {
            instance = new PassengerDatabase();
        }
        return instance;
    }

    private List<String> passengerList = new ArrayList<>();

    public void addPassenger(String passengerName) {
        passengerList.add(passengerName);
    }

    public List<String> getPassengerList() {
        return Collections.unmodifiableList(passengerList);
    }

}
