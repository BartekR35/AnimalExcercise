package Animals;

public class Bird extends Animal {
    private String featherColor;

    // Konstruktory
    public Bird() {
        super();
        this.featherColor = "Unknown";
    }

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name, String featherColor) {
        super(name);
        this.featherColor = featherColor;
    }

    // Nadpisanie metod
    @Override
    public void eat() {
        System.out.println(name + " (a bird) is eating seeds.");
    }

    @Override
    public String getVoice() {
        return name + " chirps.";
    }

    // Specyficzna metoda
    public void fly() {
        System.out.println(name + " is flying.");
    }

    // Metody dostępowe
    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public String toString() {
        return "Bird{" + super.toString() + ", featherColor='" + featherColor + "'}";
    }
}
