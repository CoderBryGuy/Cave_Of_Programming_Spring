package programming.bryan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    private static final Logger log = LoggerFactory.getLogger(App.class);
    private static final String CONFIG_LOCATION = "beans.xml";

    public static void main(String[] args) {
        log.info("Inside app.main()");

        //== create context ==
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext(CONFIG_LOCATION);

        //== create person ==
        Person person = context.getBean("person", Person.class);
//        Person person2 = context.getBean("person", Person.class);
//        person.speak();

        Address address2 = (Address)context.getBean("address2");
        log.info("address2: " + address2);

        person.setTaxId(8282);
        log.info("INFO person: " + person.toString());

//        Address address = context.getBean("address", Address.class);
//        log.info("address: " + address.toString());

        context.close();
    }


}
