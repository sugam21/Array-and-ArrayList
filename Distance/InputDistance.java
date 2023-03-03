package Distance;
import java.util.Scanner;
import java.io.*;
public class InputDistance {


    // Taking the input of array
    Scanner scan = new Scanner(System.in);
    double[] arrayDist() {
        System.out.print("Enter the size of array => ");
        int n = scan.nextInt();
        System.out.println("*****************************");

        double[] dist = new double[n]; // Array to take input of distances

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the array => ");
            dist[i] = scan.nextDouble();
        }

        return dist;
    }
}
