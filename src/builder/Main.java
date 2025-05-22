package builder;

public class Main {
    public static void main(String[] args) {
        Mansion mansionConcrete = new Mansion("Ahmed");
        Bungalow bungalowConcrete = new Bungalow("Ansari");

        HouseDirector director = new HouseDirector();
        director.build(bungalowConcrete);
        director.build(mansionConcrete);

        House mansion = mansionConcrete.getHouse();
        House bunglow = bungalowConcrete.getHouse();

        System.out.println(mansion.toString());
        System.out.println(bunglow.toString());
    }
}