package builder;

public class House {
    private String wall;
    private String roof;
    private String floor;
    private String name;

    public House() {
    }

    public House(String name) {
        this.name = name;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getName() {
        return name;
    }

    public House setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "builder.House{" +
                "wall='" + wall + '\'' +
                ", roof='" + roof + '\'' +
                ", floor='" + floor + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}