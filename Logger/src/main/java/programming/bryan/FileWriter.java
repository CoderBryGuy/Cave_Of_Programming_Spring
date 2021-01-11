package programming.bryan;

import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriter {

    public void write(String s){

        try(BufferedWriter bw = new BufferedWriter(new java.io.FileWriter("My_FileWriter_Output.txt"))){
            bw.write("nanananana this is working \n" + s);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
