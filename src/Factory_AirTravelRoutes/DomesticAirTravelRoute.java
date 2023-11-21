package Factory_AirTravelRoutes;

public class DomesticAirTravelRoute implements AirTravelRoute {
    @Override
    public void displayRoute() {
        System.out.println("✈ Domestic air travel route displayed.");
    }
}
