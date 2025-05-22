package builder;

public class HouseDirector {
    void build(HouseBuilder builder) {
        if (builder instanceof Mansion) {
            builder.createFloor("Wooden Floor");
            builder.createRoof("Glass Roof");
            builder.createWalls("Tile Walls");
            ((Mansion) builder)
                    .setZoo("Big Zoo")
                    .setFountain("Huge Fountain")
                    .setFountain("Huge Fountain")
                    .setSwimmingPool("Clean Pool");
        } else if (builder instanceof Bungalow) {
            builder.createFloor("Concrete Floor");
            builder.createRoof("Plain Roof");
            builder.createWalls("Plain Walls");
            ((Bungalow) builder).setCarPorch("Big Car Porch");
        }
    }
}