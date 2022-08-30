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
        fullness = fullness + addFood;
    }

    public void removeFullness(int removeFood) {
        fullness = fullness - removeFood;
    }

    public void getPlateInfo() {
        System.out.println("There is a " + fullness + " gram in the " + name);
    }
}
