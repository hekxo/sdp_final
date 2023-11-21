import Adapter_Currency_Converter.*;
import Decorator__Ticket_Option.*;

import Factory_AirTravelRoutes.AirTravelRoute;
import Factory_AirTravelRoutes.AirTravelRouteFactory;
import Factory_AirTravelRoutes.DomesticRouteFactory;
import Factory_AirTravelRoutes.InternationalRouteFactory;

import Observer_Tickets_Check.Passenger;
import Observer_Tickets_Check.TicketAvailability;
import Observer_Tickets_Check.TicketAvailabilityObserver;
import Singleton_Passenger_DB.PassengerDatabase;

import Strategy_Purchasing_Ticket.BusinessClassStrategy;
import Strategy_Purchasing_Ticket.EconomyClassStrategy;
import Strategy_Purchasing_Ticket.FirstClassStrategy;
import Strategy_Purchasing_Ticket.FlightTicket;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------------------------------------------------------");

        AirTravelRouteFactory domesticRouteFactory = new DomesticRouteFactory();
        AirTravelRoute domesticRoute = domesticRouteFactory.createRoute();
        domesticRoute.displayRoute();

        System.out.println("-------------------------------------------------------------------------");

        AirTravelRouteFactory internationalRouteFactory = new InternationalRouteFactory();
        AirTravelRoute internationalRoute = internationalRouteFactory.createRoute();
        internationalRoute.displayRoute();

        System.out.println("-------------------------------------------------------------------------");

        TicketAvailability ticketAvailability = new TicketAvailability();
        TicketAvailabilityObserver passenger1 = new Passenger("Ramin");

        ticketAvailability.registerObserver(passenger1);

        ticketAvailability.setTicketAvailabilityByDate("2023-11-26", true);
        ticketAvailability.setTicketAvailabilityByDate("2023-11-27", false);
        ticketAvailability.setTicketAvailabilityByDate("2023-11-28", true);

        System.out.println("-------------------------------------------------------------------------");

        PassengerDatabase passengerDatabase = PassengerDatabase.getInstance();
        passengerDatabase.addPassenger("Sagandykov Ramin");
        passengerDatabase.addPassenger("Kanay Bekzat");
        passengerDatabase.addPassenger("Lesbek Nurbakhyt");
        passengerDatabase.addPassenger("Kaskyrbaev Muhammed");
        passengerDatabase.addPassenger("Kuanyshbaev Aset");
        List<String> passengers = passengerDatabase.getPassengerList();
        System.out.println("Passengers: " + passengers);

        System.out.println("-------------------------------------------------------------------------");

        FlightTicket flightTicket = new FlightTicket();

        System.out.println("Select the ticket class: ");
        System.out.println("1. Economy-Class");
        System.out.println("2. First-Class");
        System.out.println("3. Business-Class");

        int ticketClassChoice = scanner.nextInt();
        switch (ticketClassChoice) {
            case 1 -> flightTicket.setTicketClassStrategy(new EconomyClassStrategy());
            case 2 -> flightTicket.setTicketClassStrategy(new FirstClassStrategy());
            case 3 -> flightTicket.setTicketClassStrategy(new BusinessClassStrategy());
            default -> System.out.println("Invalid choice!");
        }

        flightTicket.selectTicketClass();

        System.out.println("-------------------------------------------------------------------------");

        FlightTicketComponent basicTicket = new BasicFlightTicket();
        System.out.println("Select ticket options: ");
        System.out.println("1. Luggage involved");
        System.out.println("2. No luggage involved");
        System.out.println("3. Refund involved");
        System.out.println("4. No refund involved");
        System.out.println("5. Luggage + refund involved");

        int ticketOptionChoice = scanner.nextInt();
        switch (ticketOptionChoice) {
            case 1 -> basicTicket = new WithLuggageDecorator(basicTicket);
            case 2 -> basicTicket = new WithoutLuggageDecorator(basicTicket);
            case 3 -> basicTicket = new WithRefundDecorator(basicTicket);
            case 4 -> basicTicket = new WithoutRefundDecorator(basicTicket);
            case 5 -> {
                basicTicket = new WithLuggageDecorator(basicTicket);
                basicTicket = new WithRefundDecorator(basicTicket);
            }
        }

        System.out.println("-------------------------------------------------------------------------");

        ForeignPaymentSystemInterface foreignPaymentSystem = new ForeignPaymentSystem();
        PaymentSystem paymentSystemAdapter = new CurrencyConverterAdapter(foreignPaymentSystem);
        PaymentClient paymentClient = new PaymentClient();

        if (ticketClassChoice == 1) {
            paymentClient.makePayment(paymentSystemAdapter, 70);
        }
        else if (ticketClassChoice == 2) {
            paymentClient.makePayment(paymentSystemAdapter, 110);
        }
        else {
            paymentClient.makePayment(paymentSystemAdapter, 250);
        }

        System.out.println("-------------------------------------------------------------------------");

        basicTicket.purchaseTicket();

    }
}
