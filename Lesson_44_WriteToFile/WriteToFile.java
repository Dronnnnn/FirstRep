package Lesson_44_WriteToFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Test2");
        PrintWriter pw= new PrintWriter(file);

        pw.println("File_string");
        pw.println("File_string2");

        pw.close();
    }

}
