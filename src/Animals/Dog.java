package Animals;

public class Dog extends Mammal implements AnimalBehavior, AnimalMove {
    private String breed;

    // Konstruktory
    public Dog() {
        super();
        this.breed = "Unknown";
    }

    public Dog(String name, int age, double weight, String furColor, String breed) {
        super(name, age, weight, furColor);
        this.breed = breed;
    }

    public Dog(String name, String breed) {
        super(name, "Brown");
        this.breed = breed;
    }

    // Nadpisanie metod
    @Override
    public void eat() {
        System.out.println(name + " (a dog) is eating dog food.");
    }

    @Override
    public String getVoice() {
        return name + " says: Woof!";
    }

    // Specyficzna metoda
    public void fetch() {
        System.out.println(name + " is fetching the ball.");
    }

    // Metody dostępowe
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() + ", breed='" + breed + "'}";
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }
    @Override
    public void move(Object ob) {
        System.out.println(ob.getClass().getSimpleName() + " runs on four paws.");
    }
}
