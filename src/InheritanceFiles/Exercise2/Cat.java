package InheritanceFiles.Exercise2;

public class Cat extends Pet{
    private String eyeColour;

    public Cat(int age,String name, String eyeColour){
        super(age, name);
        this.eyeColour = eyeColour;
    }

    @Override
    public String sound() {
        return "Meow!";
    }

    @Override
    public String toString(){
        return super.toString() + "\nEye colour: " + eyeColour;
    }
}
