package InheritanceFiles.Exercise2;

public class Fish extends Pet{

    private boolean fed;

    public Fish(int age, String name, boolean fed){
        super(age, name);
        this.fed = fed;
    }

    @Override
    public String sound(){
        return "....";
    }

    @Override
    public String toString(){
        return super.toString() + "\nIs fed: " + fed;
    }
}
