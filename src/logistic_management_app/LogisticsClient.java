package logistic_management_app;

public class LogisticsClient {
    public static void main(String[] args) {

        Logistic truckLogistic = new RoadLogistics();
        Transport transport1 = truckLogistic.createTransport();
        transport1.deliver();

        Logistic shipLogistic = new SeaLogistics();
        Transport transport2 = shipLogistic.createTransport();
        transport2.deliver();
    }
}
