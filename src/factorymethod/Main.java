package factorymethod;

public class Main {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Client carClient = new Client(carFactory);
        Vehicle car = carClient.getVehicle();
        car.printVehicle();

        VehicleFactory truckFactory = new TruckFactory();
        Client truckClient = new Client(truckFactory);
        Vehicle truck = truckClient.getVehicle();
        truck.printVehicle();
    }
}