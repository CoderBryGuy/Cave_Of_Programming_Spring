package programming.bryan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class JungleImpl implements Jungle {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    private Animal largest;
    private List<Animal> animals;

    @Override
    public void init() {
        log.info("inside JungleImpl.init()");
    }

    @Override
    public void destroy() {
        log.info("inside JungleImpl.destroy()");
    }

    @Override
    public Animal getLargest() {
        return largest;
    }

    @Override
    public void setLargest(Animal largestAnimal) {
        largest = largestAnimal;
    }

    @Override
    public List<Animal> getAnimals() {
        return animals;
    }

    @Override
    public void setAnimals(List<Animal> animals) {
            this.animals = animals;
    }

    @Override
    public String toString() {
        return "JungleImpl{" +
                "largest=" + largest +
                ", animals=" + animals +
                '}';
    }
}
