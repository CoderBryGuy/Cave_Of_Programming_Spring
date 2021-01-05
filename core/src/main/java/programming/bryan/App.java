package programming.bryan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

private static final Logger log = LoggerFactory.getLogger(App.class);
private static final String CONFIG_LOCATION = "beans.xml";

    public static void main(String[] args) {
        log.info("guess the number game");

        //== create context ==
        ConfigurableApplicationContext context =
            new ClassPathXmlApplicationContext(CONFIG_LOCATION);

        //== create person ==
        Person person = context.getBean("person", Person.class);

        person.speak();

        log.info("INFO person: " + person.toString());

        Address address = context.getBean("address", Address.class);
        log.info("address: " + address.toString());
    }


}
