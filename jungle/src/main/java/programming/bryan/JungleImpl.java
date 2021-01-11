package programming.bryan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class JungleImpl implements Jungle {

    private static final Logger log = LoggerFactory.getLogger(Main.class);
    private Map<String, String> foods = new HashMap<>();
    private Map<String, Animal> animals = new HashMap<>();


    private Animal largest;
//    private List<Animal> animals;

    @Override
    public void init() {
        log.info("inside JungleImpl.init()");
    }

    @Override
    public void destroy() {
        log.info("inside JungleImpl.destroy()");
    }

    public void setFoods(Map<String, String>foods){
        this.foods = foods;
    }

    public void setAnimals(Map<String, Animal> animals){
        this.animals = animals;
    }

    public Map<String, Animal> getAnimals(){
        return animals;
    }

    public Map<String, String> getFoods() {
        return foods;
    }

    @Override
    public Animal getLargest() {
        return largest;
    }

    @Override
    public void setLargest(Animal largestAnimal) {
        largest = largestAnimal;
    }

//    @Override
//    public List<Animal> getAnimals() {
////        return animals;
//        return null;
//    }

//    @Override
//    public void setAnimals(List<Animal> animals) {
////            this.animals = animals;
//    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, String> entry :foods.entrySet()
             ) {
            sb.append(entry.getKey() + " : " + entry.getValue() + " \n");
        }

        sb.append("\n");

        for (Map.Entry<String, Animal> entry : animals.entrySet()
             ) {
            sb.append(entry.getKey() + " : " + entry.getValue() + " \n");
        }

        return sb.toString();
    }
}
