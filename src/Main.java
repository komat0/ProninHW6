public class Main {
    public static void main(String[] args) {

        Plate bluePlate = new Plate("Blue Plate", 45);
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Barsik", 25);
        cats[1] = new Cat("Red", 5);
        cats[2] = new Cat("Vaska", 20);
        cats[3] = new Cat("Faraon", 15);

        bluePlate.getPlateInfo();
        for (Cat cat : cats) {
            cat.eat(bluePlate);
        }
        bluePlate.getPlateInfo();
        bluePlate.addFullness(100);
        bluePlate.getPlateInfo();

    }
}