package ArrayLists;
import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)
    {
        // CREATING INSTANCE OF INPUT ARRAY AND INPUT ARRAY LIST CLASS
        InputArray a = new InputArray();
        InputArrayList l = new InputArrayList();

        String[] arr = a.inputArray(); // CAPTURING THE RETURNED ARRAY
        ArrayList<String> list = l.lists(); //CAPTURING THE RETURNED ARRAY LIST

        // CREATING INSTANCE OF SHUFFLING
        Shuffling s = new Shuffling();
        // CALLING THE SHUFFLING METHOD
       s.listToArray(list);
       s.arrayToList(arr);

    }
}
