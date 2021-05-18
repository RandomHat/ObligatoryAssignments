package InheritanceFiles.Exercise2;

public abstract class Pet {
    // Base class for the pets. It is made abstract to allow for the abstract sound method.
    // It also doesn't seem right to allow this pet class to be instantiated.


    // A pet has an age and a name
    private int age;
    private String name;

    // super constructor
    Pet(int age, String name){
        this.age = age;
        this.name = name;
    }

    // All animals and pets make some kind of sound right?
    public abstract String sound();

    // description using toString.
    @Override
    public String toString(){
        return "Name: " + name + "\nAge: " + age;
    }
}
