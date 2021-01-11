package programming.bryan;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {


    private static final String CONFIG_LOCATION = "beans.xml";

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext(CONFIG_LOCATION);

        Logger log = (Logger) context.getBean("logger");
        log.writeConsole("Hi there");
        log.writefile("Hi there");

        context.close();
    }
}
