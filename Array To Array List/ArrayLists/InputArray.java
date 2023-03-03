package ArrayLists;
import java.util.ArrayList;
import java.util.Scanner;

public class InputArray {
    // Function to input the string of ArrayList
    String[] inputArray()
    {
        String in;
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter the length of the array =>");
        n = scan.nextInt();

        String[] arr = new String[n];
        System.out.println("************************");
        System.out.println("Enter the elements of Array:");
        for (int i = 0; i < n; i++) {
            in = scan.next();
            arr[i] = in;

        }
        return arr; //RETURNING THE LIST OF STRINGS
    }

}
