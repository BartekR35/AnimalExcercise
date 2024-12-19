package Animals;

public class Mammal extends Animal {
    private String furColor;

    // Konstruktory
    public Mammal() {
        super();
        this.furColor = "Unknown";
    }

    public Mammal(String name, int age, double weight, String furColor) {
        super(name, age, weight);
        this.furColor = furColor;
    }

    public Mammal(String name, String furColor) {
        super(name);
        this.furColor = furColor;
    }

    // Nadpisanie metod
    @Override
    public void eat() {
        System.out.println(name + " (a mammal) is eating.");
    }

    @Override
    public String getVoice() {
        return name + " says: Mammal sound.";
    }

    // Specyficzna metoda
    public void run() {
        System.out.println(name + " is running.");
    }

    // Metody dostępowe
    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public String toString() {
        return "Mammal{" + super.toString() + ", furColor='" + furColor + "'}";
    }
}
