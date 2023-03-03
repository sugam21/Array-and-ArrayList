package ArrayLists;

import java.util.*;
import java.io.*;
public class InputArrayList
    {
        Scanner scan = new Scanner(System.in); //Creating the object of scanner

        //FUNCTION TO RETURN ARRAY LIST
        //---------------------------------
        ArrayList<String> lists() {
            // Function to input the string of ArrayList
            ArrayList<String> list = new ArrayList<String>();
                int n;
                System.out.print("Enter the length for array list =>");
                n = scan.nextInt();
                System.out.println("************************");
                System.out.println("Enter the elements of Array List:");
                for (int i = 0; i < n; i++) {
                    String in = new String();
                    in = scan.next();
                    list.add(i, in);
                }
                return list;

        }

    }

