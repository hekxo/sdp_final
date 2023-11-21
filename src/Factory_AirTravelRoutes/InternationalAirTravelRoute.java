package Factory_AirTravelRoutes;

public class InternationalAirTravelRoute implements AirTravelRoute {
    @Override
    public void displayRoute() {
        System.out.println("✈ International air travel route displayed.");
    }
}
