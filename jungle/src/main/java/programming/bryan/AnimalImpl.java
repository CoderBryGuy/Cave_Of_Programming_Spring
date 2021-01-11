package programming.bryan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class AnimalImpl implements Animal {

    private String name;
    private String type;

    private static final Logger log = LoggerFactory.getLogger(Main.class);


    @Override
    public void init() {
        log.info("inside AnimalImpl.init();\n" +
                "name: " + name );
    }

    @Override
    public void destroy() {
        log.info("inside AnimalImpl.destroy()");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "AnimalImpl{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AnimalImpl)) return false;
        AnimalImpl animal = (AnimalImpl) o;
        return name.equals(animal.name) && type.equals(animal.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }
}
