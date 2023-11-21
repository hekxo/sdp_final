package Factory_AirTravelRoutes;

public class DomesticRouteFactory implements AirTravelRouteFactory {
    @Override
    public AirTravelRoute createRoute() {
        return new DomesticAirTravelRoute();
    }
}
