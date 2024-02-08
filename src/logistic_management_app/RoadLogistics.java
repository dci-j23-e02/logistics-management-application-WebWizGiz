package logistic_management_app;

public class RoadLogistics extends Logistic{

    //Override the createTransport method to return an instance of TRUCK
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
