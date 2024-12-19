package Animals;

public class Main {
    public static void main(String[] args) {
        Animal animals[] = new Animal[7];

        // Inicjalizacja obiektów z różnych klas
        animals[0] = new Dog("Buddy", 5, 20.0, "Brown", "Labrador");
        animals[1] = new Pigeon("Sky", 2, 1.5, "Gray", "Rock Dove");
        animals[2] = new Mammal("Tiger", 8, 200.0, "Orange");
        animals[3] = new Bird("Parrot", 3, 0.9, "Green");
        animals[4] = new Fish("Goldfish", 1, 0.2, "Gold");
        animals[5] = new Blowfish("Puffy", 2, 0.5, "Yellow", false);

        // Wyświetlanie obiektów i wywoływanie metod
       /* for (Animal animal : animals) {
            System.out.println(animals.toString());
            animal.eat();
            System.out.println(animal.getVoice());

            // Specyficzne metody dla klas pochodnych
            if (animal instanceof Mammal) {
                ((Mammal) animal).run();
            }
            if (animal instanceof Bird) {
                ((Bird) animal).fly();
            }
            if (animal instanceof Fish) {
                ((Fish) animal).swim();
            }
            if (animal instanceof Blowfish) {
                Blowfish blowfish = (Blowfish) animal;
                blowfish.inflate();
                blowfish.deflate();
            }
            System.out.println();
        }*/

        AnimalBehavior animalBehavior[] = new AnimalBehavior[3];
        animalBehavior[0] = new Dog("Butkus", 5,15,"Carnivora", "Mastiff");
        animalBehavior[1] = new Pigeon("Pablo", 10,1,"Grey", "spain");
        animalBehavior[2] = new Blowfish("Blowfish", 5,2,"gray", false);

        animalBehavior[0].sleep();
        animalBehavior[1].sleep();
        animalBehavior[2].sleep();

        //foreach loop
        for (Animal a : animals) {
            a.move(a);
        }

        for (Animal a : animals) {
            AnimalName.name(a.getName());
        }
    }
}