package InheritanceFiles.Exercise2;

public abstract class Pet {
    // Base class for the pets. It is made abstract to allow for the abstract sound method.
    // It also doesn't seem right to allow this pet class to be instantiated.


    // A pet has an age and a name
    private int age;
    private final String NAME;

    // super constructor
    Pet(int age, String name){
        this.age = age;
        this.NAME = name;
    }

    // All animals and pets make some kind of sound right?
    public abstract String sound();

    public void hadBirthday(){
        age++;
    }

    // description using toString.
    @Override
    public String toString(){
        return "Name: " + NAME + "\nAge: " + age;
    }
}
