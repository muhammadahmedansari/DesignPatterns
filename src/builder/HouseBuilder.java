package builder;

public interface HouseBuilder {
    void createWalls(String floor);

    void createRoof(String floor);

    void createFloor(String floor);

    House getHouse();
}