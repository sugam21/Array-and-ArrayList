package EvenOdd;
import java.util.*;
import java.io.*;
public class EvenOddInput {
    int[] evenOddArray()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of Array:=> ");
        int n = scan.nextInt();
        int[] list = new int[n];
        for(int i=0;i<n;i++)
        {
            String index = String.valueOf(i+1); //Converting integer index into string
            System.out.print("Enter "+ index + " number =>  ");
            list[i] = scan.nextInt();
        }

        return list;

    }
}
