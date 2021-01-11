package programming.bryan;


public class Logger {

    private ConsoleWriter consoleWriter;
    private FileWriter fileWriter;

    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    public void setFileWriter(FileWriter fileWriter){
        this.fileWriter = fileWriter;
    }

    public void writefile(String text){
            fileWriter.write(text);
    }

    public void writeConsole(String text){
        consoleWriter.write(text);
    }
}
