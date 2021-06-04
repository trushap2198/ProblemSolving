package Java;
import java.util.*;
import java.io.*;

class Solve{

    public static void staircase(int n) {
        // Write your code here
        //JAVA 11<=
        /*
            String space=  " ";
            String hash = "#";
            for (int i=0;i<n;i++)
            {
                System.out.println(space.repeat(n-i-1)+ hash.repeat(i+1));
            }
        
        }
        */

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

        char[] pattern = new char[n];
        Arrays.fill(pattern, ' ');

        //System.out.printf("%s" + "%" +depth + "s", "Hello","World" );
        for (int i=1; i<=n; i++)
        {
            pattern[n-i] = '#';
            System.out.println(pattern);
            
        }
        
    }
    /*
    for (int i = 1; i <= max; i++) {
    	System.out.println(new String(new char[max-i]).replace("\0", " ") + new String(new char[i]).replace("\0", "#"));
    }*/
    //System.out.printf("%2d. %-20s $%.2f%n",  i + 1, BOOK_TYPE[i], COST[i]);

    /* INITIALIZING EMPTY OR ANY CHARATER FILLED STRING OF FIXED LENGTH WITH STRING FORMAT
        int length = 10;
        String pattern = String.format("%" + length + "s",' '); 
        System.out.println(pattern);OP= "          "
        System.out.println(pattern.length()); op = 10
        String pattern = String.format("%" + length + "s",' ').replace(" ","*"); op= "**********"
        */ 

}

public class Staircase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Solve.staircase(n);

        bufferedReader.close();
    }
}

    
