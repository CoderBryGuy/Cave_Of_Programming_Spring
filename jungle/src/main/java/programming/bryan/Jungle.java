package programming.bryan;

import java.util.Map;

public interface Jungle extends LifeCycleMethods {

    void init();
    void destroy();
    Animal getLargest();
    void setLargest(Animal largestAnimal);
//    List<Animal> getAnimals();
//    void setAnimals(List<Animal> animals);

    void setFoods(Map<String, String> foods);

    void setAnimals(Map<String, Animal> animals);

     Map<String, Animal> getAnimals();

     Map<String, String> getFoods();
}
