package Distance;
import java.lang.Math;
public class Calculation {
    double[] result() {
        // Creating object of InputDistance class
        InputDistance d = new InputDistance();
        double[] arr = d.arrayDist();
        double[] finalArr = new double[2]; //This array is for returning the minIndex and minDistance;
        double minDistance = 0;
        double minIndex = 0;
        for (int i = 0; i < arr.length - 1; i++) // The loop will go from 0 to n-1 in order to avoid index passing beyond n
        {
            if (i == 0) {
                double difference = Math.abs(arr[i] - arr[i + 1]); //abs to prevent the negative numeber
                minDistance = difference;
                minIndex = i;
            } else {
                double difference = Math.abs(arr[i] - arr[i + 1]);
                if (difference < minDistance) {
                    minDistance = difference;
                    minIndex = i;
                }
            }

        }
        finalArr[0] = minIndex;
        finalArr[1] = minDistance;

        return finalArr;
    }
}
