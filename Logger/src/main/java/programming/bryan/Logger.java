package programming.bryan;


import javax.annotation.Resource;

public class Logger {

//    public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter){
//        this.consoleWriter = consoleWriter;
//        this.fileWriter = fileWriter;
//    }

//    @Autowired
    private LogWriter consoleWriter;
//    @Autowired
    private LogWriter fileWriter;

//    @Autowired
//    public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter) {
//        this.consoleWriter = consoleWriter;
//        this.fileWriter = fileWriter;
//    }

//    @Autowired
//    @Qualifier("toconsole")
    @Resource
    public void setConsoleWriter(LogWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

//    @Autowired
//    @Qualifier("fileWriter")
    @Resource(name="squirrel")
    public void setFileWriter(LogWriter fileWriter){
        this.fileWriter = fileWriter;
    }

    public void writefile(String text){
        if(consoleWriter != null) {
            fileWriter.write(text);
        }
    }

    public void writeConsole(String text){
        if(consoleWriter != null) {
            consoleWriter.write(text);
        }
    }
}
