package Animals;

public class Blowfish extends Fish implements AnimalBehavior, AnimalMove {
    private boolean isInflated;

    // Konstruktory
    public Blowfish() {
        super();
        this.isInflated = false;
    }

    public Blowfish(String name, int age, double weight, String scaleColor, boolean isInflated) {
        super(name, age, weight, scaleColor);
        this.isInflated = isInflated;
    }

    public Blowfish(String name, boolean isInflated) {
        super(name, "Yellow");
        this.isInflated = isInflated;
    }

    // Nadpisanie metod
    @Override
    public void eat() {
        System.out.println(name + " (a blowfish) is eating small fish and sea plants.");
    }

    @Override
    public String getVoice() {
        return name + " makes a puffing sound.";
    }

    // Specyficzna metoda
    public void inflate() {
        isInflated = true;
        System.out.println(name + " is inflating its body.");
    }

    public void deflate() {
        isInflated = false;
        System.out.println(name + " is deflating.");
    }

    // Metody dostępowe
    public boolean isInflated() {
        return isInflated;
    }

    public void setInflated(boolean inflated) {
        isInflated = inflated;
    }

    @Override
    public String toString() {
        return "Blowfish{" + super.toString() + ", isInflated=" + isInflated + "}";
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }

    @Override
    public void move(Object ob) {
        System.out.println(ob.getClass().getSimpleName() + " swimming in the ocean.");
    }
}
