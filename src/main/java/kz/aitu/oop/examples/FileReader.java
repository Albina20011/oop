package kz.aitu.oop.examples;

// Java Program to illustrate reading from Text File
// using Scanner Class
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws Exception {

        FileReader fileReader = new FileReader();

        System.out.println(fileReader.getFile());
    }



    public String getFile() throws FileNotFoundException {

        File file = new File("C:\\Users\\olki\\Desktop\\input.txt");
        Scanner sc = new Scanner(file);

        String result = "";
        while (sc.hasNextLine())
            result += sc.nextLine() + "\n";
        //CHANGE FOR TEST

        return result;
    }
}