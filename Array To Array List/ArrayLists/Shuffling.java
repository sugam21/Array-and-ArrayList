package ArrayLists;
import java.util.ArrayList;

public class Shuffling {
    void listToArray(ArrayList<String> list)
    {
        //** THIS IS THE FUNCTION TO CONVERT ARRAY LIST TO LIST
        int length = list.size();
        String[] arr = new String[length]; // Creating list of string to store the data
        for(int i=0;i<length;i++)
        {
            arr[i] = list.get(i);
        }

        System.out.print("The Array after conversion from array list is:");
        for(int i=0;i<length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    void arrayToList(String[] arr)
    {
        //** THIS IS THE FUNCTION TO CONVERT ARRAY TO ARRAY LIST
        int length = arr.length;
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<length;i++)
        {
            list.add(i,arr[i]);
        }


        System.out.print("The Array List after conversion from array is :");
        System.out.println(list);
    }
}
