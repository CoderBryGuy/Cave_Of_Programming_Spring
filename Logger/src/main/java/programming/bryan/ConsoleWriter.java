package programming.bryan;

public class ConsoleWriter implements LogWriter {

    public ConsoleWriter() {
        System.out.println("Creating a ConsoleWriter object");
    }

    public void write(String s){
        System.out.println("writing to console " + s);
    }
}
