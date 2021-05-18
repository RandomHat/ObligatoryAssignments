package InheritanceFiles.Exercise2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] arg){

        // creates list of pets
        ArrayList<Pet> myPets = new ArrayList<>();

        // adds new pets in the list
        myPets.add(new Dog(2,"Arya","French Bulldog"));
        myPets.add(new Cat(11, "Snuffles", "Blue"));
        myPets.add(new Fish(1,"Blup", true));

        // displays the pets
        for(Pet pet: myPets) {
            System.out.println(pet);
            System.out.println("\n" + pet.sound() + "\n");
            System.out.println();
        }
    }
}
