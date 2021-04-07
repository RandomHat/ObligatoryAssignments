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
