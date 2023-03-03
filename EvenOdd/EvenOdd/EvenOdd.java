package EvenOdd;

import java.io.*;
import java.util.*;

public class EvenOdd{

    public static void main(String[] args)
    {
        EvenOddInput a = new EvenOddInput(); //Creating instance of the Input Array Class
        int[] list = a.evenOddArray();
        int sizeOfList = list.length;
        int even[] = new int[sizeOfList]; //Array to hold even numbers
        int odd[] = new int[sizeOfList]; //Array to hold odd numbers
        int evenIndex = 0;
        int oddIndex = 0;
        for(int i=0;i<sizeOfList;i++)
        {
            int num = list[i];
            if(list[i]%2==0)
            {
                even[evenIndex]=num;
                evenIndex++;
            }
            else {
                odd[oddIndex]=num;
                oddIndex++;
            }
        }


        // Printing the array
        System.out.print("The even array is: ");
        for(int i=0;i<evenIndex;i++)
        {
            System.out.print(even[i] + " ");
        }
        System.out.println();
        System.out.print("The odd array is: ");

        for(int i=0;i<oddIndex;i++)
        {
            System.out.print(odd[i]+ " ");
        }
    }
}