package InheritanceFiles.Exercise2;

public abstract class Entity {
    private int age;

    // Is the entity to be identified as an individual or group/collection?
    private final boolean isIndividual;
    private boolean isLiving;

    public Entity(int age, boolean isIndividual, boolean isLiving){
        this.age = age;
        this.isIndividual = isIndividual;
        this.isLiving = isLiving;
    }

    public void increaseAge(){
        if (age == -1){
            System.out.println("age is unknown");
        }
        else
            age++;
    }

    public boolean isIndividual() {
        return isIndividual;
    }

    public boolean isLiving() {
        return isLiving;
    }

    public void setLiving(boolean living) {
        isLiving = living;
    }

    @Override
    public abstract String toString();
}
