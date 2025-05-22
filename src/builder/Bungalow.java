package builder;

public class Bungalow implements HouseBuilder {
    private House house;
    private String carPorch;

    public Bungalow(String name) {
        this.house = new House(name);
    }

    public House getHouse() {
        return house;
    }

    @Override
    public void createWalls(String walls) {
        this.house.setWall(walls);
        System.out.println("Building builder.Bunglow walls ...");
    }

    @Override
    public void createRoof(String roof) {
        this.house.setRoof(roof);
        System.out.println("Building builder.Bunglow roof ...");
    }

    @Override
    public void createFloor(String floor) {
        this.house.setFloor(floor);
        System.out.println("Building builder.Bunglow floor ...");
    }

    public String getCarPorch() {
        return carPorch;
    }

    public Bungalow setCarPorch(String carPorch) {
        this.carPorch = carPorch;
        return this;
    }

    @Override
    public String toString() {
        return "builder.Bunglow{" +
                "house=" + house +
                ", carPorch='" + carPorch + '\'' +
                '}';
    }
}