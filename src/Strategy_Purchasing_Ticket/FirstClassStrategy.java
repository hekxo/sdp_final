package Strategy_Purchasing_Ticket;

public class FirstClassStrategy implements SelectingTicketClassStrategy {

    public int getMaxLuggageNumber() {
        return 2;
    }

    public String getMaxHandLuggageWeight() {
        return "10 kg";
    }

    public String getMaxLuggageWeight() {
        return "23 kg";
    }

    @Override
    public void selectTicketClass() {
        System.out.println("A first class ticket has been selected.");
        System.out.println("Maximum number of pieces of luggage: " + getMaxLuggageNumber());
        System.out.println("Maximum hand luggage weight: <=" + getMaxHandLuggageWeight());
        System.out.println("Maximum luggage weight: <=" + getMaxLuggageWeight());
    }
}
