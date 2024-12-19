package Animals;

public class Pigeon extends Bird implements AnimalBehavior, AnimalMove {
    private String species;

    // Konstruktory
    public Pigeon() {
        super();
        this.species = "Unknown";
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name, String species) {
        super(name, "Gray");
        this.species = species;
    }

    // Nadpisanie metod
    @Override
    public void eat() {
        System.out.println(name + " (a pigeon) is pecking at food.");
    }

    @Override
    public String getVoice() {
        return name + " coos.";
    }

    // Specyficzna metoda
    public void deliverMessage() {
        System.out.println(name + " is delivering a message.");
    }

    // Metody dostępowe
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Pigeon{" + super.toString() + ", species='" + species + "'}";
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }

    @Override
    public void move(Object ob) {
        System.out.println(ob.getClass().getSimpleName() + " flying and being an air rat.");
    }
}
