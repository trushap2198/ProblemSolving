package Java;

import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    int positives = 0,negatives =0, zeros = 0;
    int n = arr.size();
    for (int i=0;i<n;i++)
    {
        if (arr.get(i)>0){
            positives++;
        }
        else if (arr.get(i)<0){
            negatives++;
        }
        else{
            zeros++;
        }
    }
    System.out.println((float)positives/n);
    System.out.println((double)negatives/n);
    System.out.println((double)zeros/n);
    

    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
