package Animals;

public class Fish extends Animal {
    private String scaleColor;

    // Konstruktory
    public Fish() {
        super();
        this.scaleColor = "Unknown";
    }

    public Fish(String name, int age, double weight, String scaleColor) {
        super(name, age, weight);
        this.scaleColor = scaleColor;
    }

    public Fish(String name, String scaleColor) {
        super(name);
        this.scaleColor = scaleColor;
    }

    // Nadpisanie metod
    @Override
    public void eat() {
        System.out.println(name + " (a fish) is eating aquatic plants.");
    }

    @Override
    public String getVoice() {
        return name + " makes bubbling sounds.";
    }

    // Specyficzna metoda
    public void swim() {
        System.out.println(name + " is swimming.");
    }

    // Metody dostępowe
    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    @Override
    public String toString() {
        return "Fish{" + super.toString() + ", scaleColor='" + scaleColor + "'}";
    }
}
