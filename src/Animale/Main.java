package Animale;

import static Animale.Animal.getCountOfAnimals;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(200);
        Dog dog = new Dog(500, 10);
        iAnimal[] animals = {(iAnimal) cat, (iAnimal) dog};
        for (iAnimal animal : animals) {
            System.out.println(animal.run(100));
            System.out.println(animal.run(300));
            System.out.println(animal.swim(3));
            System.out.println(animal.swim(10));
        }

        System.out.println("Animals were creted: " + Animal.getCountOfAnimals());
    }
}