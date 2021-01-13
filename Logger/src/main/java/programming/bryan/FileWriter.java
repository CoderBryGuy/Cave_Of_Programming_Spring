package programming.bryan;

import org.springframework.beans.factory.annotation.Qualifier;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

@Qualifier("fileWriter")
public class FileWriter implements LogWriter {

    public FileWriter() {
        System.out.println("Creating a FileWriter object");
    }

    public void write(String s){

        File file = new File("My_FileWriter_Output.txt");

        try(BufferedWriter bw = new BufferedWriter(new java.io.FileWriter(file))){
            bw.write("nanananana this is working \n" + s);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
