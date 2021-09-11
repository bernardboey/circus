package circus;

import java.util.ArrayList;
import java.util.Arrays;

import circus.animal.Animal;
import circus.animal.Duck;
import circus.animal.Elephant;
import circus.animal.Parrot;
import circus.animal.Tiger;
import circus.stuff.Cannon;
import circus.stuff.Equipment;
import circus.stuff.Ladder;

public class Circus {
    private static Animal[] animals = {
            new Duck("Drake"),
            new Parrot("Polly")
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
        }
    }

    private static int calculateAssetValue(Asset[] assets) {
        int total = 0;
        for (Asset a : assets) {
            if (a.getValue() <= 5) {
                System.out.println("Ignoring low value item: " + a.getValue());
                continue;
            }
            total += a.getValue();
            System.out.println("Adding item value: " + a.getValue());
        }
        return total;
    }

    public static void main(String[] args) {
        // makeAnimalsTalk();
        // System.out.println("Total value of animals " + calculateAssetValue(animals));
        // System.out.println("Total value of equipments " + calculateAssetValue(equipments));

        System.out.println("Number of animals: " + animals.length);

        ArrayList<Animal> animalArrayList = new ArrayList<>(Arrays.asList(animals));

        System.out.println("Size of the array list: " + animalArrayList.size());
        animalArrayList.add(new Parrot("Dolly"));
        animalArrayList.add(new Duck("Goose"));
        System.out.println("Size of the array list: " + animalArrayList.size());

        Duck louie = new Duck("Louie");
        animalArrayList.add(louie);
        Elephant strongOne = new Elephant("Strong one");
        Tiger shareKhan = new Tiger("Share Khan");
        printAllAnimals(animalArrayList);
        System.out.println("Index of Louie : " + animalArrayList.indexOf(louie));

        animalArrayList.sort(Animal.AnimalNameComparator);
        System.out.println("After sorting ...");
        printAllAnimals(animalArrayList);
        System.out.println("Index of Louie : " + animalArrayList.indexOf(louie));
    }

    private static void printAllAnimals(ArrayList<Animal> animalArrayList) {
        for (Animal a : animalArrayList) {
            System.out.println(a);
        }
    }
}
