package logistic_management_app;

public class SeaLogistics extends Logistic {

    //Override the createTransport method to return an instance of SHIP
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
