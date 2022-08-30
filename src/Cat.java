public class Cat {
    private final String name;
    private int hunger;

    public Cat(String name, int hunger) {
        this.name = name;
        this.hunger = hunger;
    }

    public int getHunger() {
        System.out.println(name + " want to eat " + hunger + " gram of food");
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void eat(Plate plateName) {
        if (hunger <= plateName.getFullness()) {
            plateName.removeFullness(hunger);
            setHunger(0);
            System.out.println(name + " ate and now didn't hungry");
        } else {
            System.out.println("There is not enough food in this plate to fully feed the " + name + ". Try another plate.");
        }
    }
}
