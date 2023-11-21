package Strategy_Purchasing_Ticket;

public class BusinessClassStrategy implements SelectingTicketClassStrategy {

    public int getMaxLuggageNumber() {
        return 2;
    }

    public String getMaxHandLuggageWeight() {
        return "10 kg";
    }

    public String getMaxLuggageWeight() {
        return "32 kg";
    }

    @Override
    public void selectTicketClass() {
        System.out.println("A business-class ticket has been selected.");
        System.out.println("Maximum number of pieces of luggage: " + getMaxLuggageNumber());
        System.out.println("Maximum hand luggage weight: <=" + getMaxHandLuggageWeight());
        System.out.println("Maximum luggage weight: <=" + getMaxLuggageWeight());
    }
}
