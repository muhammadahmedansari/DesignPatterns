package builder;

public class Mansion implements HouseBuilder {
    private House house;
    private String fountain;
    private String swimmingPool;
    private String zoo;

    public Mansion(String name) {
        this.house = new House(name);
    }

    public House getHouse() {
        return house;
    }

    @Override
    public void createWalls(String walls) {
        this.house.setWall(walls);
        System.out.println("Building builder.Mansion walls ...");
    }

    @Override
    public void createRoof(String roof) {
        this.house.setRoof(roof);
        System.out.println("Building builder.Mansion roof ...");
    }

    @Override
    public void createFloor(String floor) {
        this.house.setFloor(floor);
        System.out.println("Building builder.Mansion floor ...");
    }

    public String getFountain() {
        return fountain;
    }

    public Mansion setFountain(String fountain) {
        this.fountain = fountain;
        return this;
    }

    public String getSwimmingPool() {
        return swimmingPool;
    }

    public Mansion setSwimmingPool(String swimmingPool) {
        this.swimmingPool = swimmingPool;
        return this;
    }

    public String getZoo() {
        return zoo;
    }

    public Mansion setZoo(String zoo) {
        this.zoo = zoo;
        return this;
    }

    @Override
    public String toString() {
        return "builder.Mansion{" +
                "house=" + house +
                ", fountain='" + fountain + '\'' +
                ", swimmingPool='" + swimmingPool + '\'' +
                ", zoo='" + zoo + '\'' +
                '}';
    }
}