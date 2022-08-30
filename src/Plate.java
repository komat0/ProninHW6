public class Plate {
    private final String name;
    private int fullness;

    public Plate(String name, int fullness) {
        this.name = name;
        this.fullness = fullness;
    }

    public int getFullness() {
        return fullness;
    }

    public void addFullness(int addFood) {
        int newFood = fullness + addFood;
        fullness = newFood;
    }

    public void removeFullness(int removeFood) {
        int newFood = fullness - removeFood;
        fullness = newFood;
    }

    public void getPlateInfo() {
        System.out.println("There is a " + fullness + " gram in the " + name);
    }
}
