package Animals;

public abstract class Animal implements AnimalMove, AnimalName {
    public String name;
    public int age;
    public double weight;

    //konstruktory
    public Animal() {
        this.name = " ";
        this.age = 0;
        this.weight = 0.0;
    }

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Animal(String name) {
        this.name = name;
        this.age = 0;
        this.weight = 0.0;
    }

    // Metody
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public String getVoice() {
        return name + " makes a sound.";
    }

    // Metody dostępowe
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', age=" + age + ", weight=" + weight + '}';
    }
}
