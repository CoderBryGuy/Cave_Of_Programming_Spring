package programming.bryan;

import java.util.List;

public interface Jungle extends LifeCycleMethods {

    void init();
    void destroy();
    Animal getLargest();
    void setLargest(Animal largestAnimal);
    List<Animal> getAnimals();
    void setAnimals(List<Animal> animals);
}
