package Distance;
import java.io.*;
public class Display {

    void display() {

        //Creating the instance of Calculation object
        Calculation c = new Calculation();
        double[] result = c.result();
        System.out.println("*****************************");

        // Displaying the output of the function
        System.out.println("The minimum distance is => " + result[1]);
        System.out.println("The index of first number is: => " + result[0]);
    }
}
