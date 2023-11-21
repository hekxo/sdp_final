# Name of the project: AviaSales
# Group: SE-2210
# Project Overview: 
In this project, users can view current domestic and international flights, choose a ticket class (Economy Class, First Class or Business Class), specify additional options in the ticket and successfully purchase their ticket when paying.
# Idea of the project: 
Provide users with a user-friendly interface for buying airline tickets. The project should include the correct and effective use of design patterns to solve common programming problems.
# Purpose of the project:
Create a full-fledged project with the implementation of six design patterns. Determine the meaning of these patterns in the project, how they are used.
<br>

## Singleton Design Pattern:
![image](https://github.com/hekxo/sdp_final/assets/105925538/0e677fcc-4012-4efe-a89a-ef3c89041de1)
The project uses the Singleton design pattern. The PassengerDatabase class is a pseudo-database and uses lazy initialization of the Singleton pattern. The addPassenger() method is used to add passengers to the pseudo-database, and the getPassengerList method returns an immutable list of passengers to ensure data encapsulation.

## Strategy Design Pattern:
![image](https://github.com/hekxo/sdp_final/assets/105925538/1877cd21-dc6f-4f04-b44d-69d3ba76e22e)
<br>
<b>Context</b>: FlightTicket Class.<br>
<b>Strategy interface</b>: SelectingTicketClassStrategy Class.<br>
<b>Concrete Strategies</b>: EconomyClassStrategy, FirstClassStrategy, BusinessClassStrategy.<br>

In the project, you can dynamically change the ticket purchase strategy by selecting one of the ticket classes using the setTicketClassStrategy() method. In this example, these are Economy Class, First Class and Business Class tickets. Depending on which class will be selected, the corresponding characteristics of the ticket will vary. Thus, you can easily switch between different buying strategies without changing the class of the ticket.

## Decorator Design Pattern:
![image](https://github.com/hekxo/sdp_final/assets/105925538/17c8aa36-d62d-4f20-89f9-17a631346b93)
<br>
<b>Component interface</b>: FlightTicketComponent Class.<br>
<b>Concrete Component</b>: BasicFlightTicket Class.<br>
<b>Base Decorator</b>: TicketDecorator Class.<br>

The Decorator design pattern is used here to dynamically add additional functionality to the Basic Flight Ticket. When buying a ticket, a passenger has the opportunity to choose a ticket with included luggage, without luggage, with a refund, or without a refund.

## Adapter Design Pattern: 
![image](https://github.com/hekxo/sdp_final/assets/105925538/96246ead-d543-43e5-adf7-fb4ce8816cee)
<br>
<b>Client</b>: PaymentClient Class.<br>
<b>Client Interface</b>: PaymentSystem Class.<br>
<b>Adapter</b>: CurrencyConverterAdapter Class.<br>
<b>Adaptee Interface</b>: ForeignPaymentSystemInterface Class.<br>
<b>Concrete Adaptee</b>: ForeignPaymentSystem Class.<br>

The Adapter design pattern includes the conversion of the dollar currency(USD) into tenge(KZT). When the pay() method is called, it converts the amount from USD to tenge based on the specified exchange rate and then calls the makePayment() method of the ForeignPaymentSystem with the converted amount and the target currency ("KZT"). This is useful for the airline's payment system to quickly and automatically convert payments using another currency into our currency.

## Factory Design Pattern:
![image](https://github.com/hekxo/sdp_final/assets/105925538/cc27f3d0-ab44-4bd6-afff-1a033531cbd5)
<br>
<b>Factory Interface</b>: AirTravelRouteFactory interface.<br>
<b>Concrete Factories</b>: DomesticRouteFactory, InternationalRouteFactory.<br>
<b>Product Interface</b>: AirTravelRoute interface.<br>
<b>Concrete Products</b>: DomesticAirTravelRoute, InternationsAirTravelRoute.<br>

Now factories are responsible for creating copies of various air travel routes. We create types of routes for air travel, according to the type of domestic and international air travel. You can easily extend this system by adding new route types without changing the client code.

## Observer Design Pattern:
![image](https://github.com/hekxo/sdp_final/assets/105925538/21f979ff-a6f0-4a5b-9c12-d893ed159563)
<br>
<b>Publisher/Subject Interface</b>: TicketAvailabilitySubject Class.<br>
<b>Concrete Subject</b>: TicketAvailability Class.<br>
<b>Observer Interface</b>: TicketAvailabilityObserver Class.<br>
<b>Conrete Observer</b>: Passenger Class.<br>

The Observer design pattern is used so that passengers can subscribe to the mailing of notifications about the availability of air tickets for a specific date. To do this, they contain the update() method, which is called whenever the object changes. The Passenger Class is a specific observer who monitors the status of the TicketAvailability object.

<br>

![image](https://github.com/hekxo/sdp_final/assets/105925538/00704eaa-1698-42d3-9a49-bc4f3e0ff929)

<br>

# Conclusion:
This project aims to develop a user-friendly airline ticket booking system that incorporates six design patterns to enhance its functionality and maintainability. The project will provide users with a convenient platform to search for and purchase domestic and international flights, selecting from various ticket classes and additional options. By implementing design patterns, the project ensures code reusability, flexibility, and adaptability, making it a well-structured and robust application.
