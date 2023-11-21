package Factory_AirTravelRoutes;

public class InternationalRouteFactory implements AirTravelRouteFactory {
    @Override
    public AirTravelRoute createRoute() {
        return new InternationalAirTravelRoute();
    }
}
