package InheritanceFiles.Exercise2;

public class Dog extends Pet{
    private String race;

    public Dog(int age, String name, String race){
        super(age,name);
        this.race = race;
    }

    @Override
    public String sound() {
        return "Woof!";
    }

    @Override
    public String toString() {
        return super.toString() + "\nRace: " + race;
    }
}
