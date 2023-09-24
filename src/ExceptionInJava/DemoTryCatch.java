package ExceptionInJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DemoTryCatch {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("test.in"));
            // do something if no exception ...
            // you main logic here in the try-block
        } catch (FileNotFoundException ex) { // error handling separated from the main logic
            ex.printStackTrace();             // print the stack trace
        }
    }
}
