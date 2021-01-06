package programming.bryan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersonFactory {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    public Person createPerson(){
        log.info("inside PersonFactory.createPerson()");
        return new PersonImpl();
    }

//    public Person createPerson(int id, String name){
//        log.info("inside PersonFactory.createPerson()");
//        return new PersonImpl(id, name);
//    }
}
