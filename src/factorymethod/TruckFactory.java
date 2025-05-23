package factorymethod;

public class TruckFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new Truck();
    }
}