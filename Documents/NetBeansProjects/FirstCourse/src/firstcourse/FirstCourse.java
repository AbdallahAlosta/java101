
package firstcourse;

import java.util.Scanner;

public class FirstCourse {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
    First f = new First();
    int [] [] x = f.createMultiArray(2,3);
        for (int i = 0; i < x.length; i++) {
            int[] is = x[i];
            for (int j : is) {
                j = in.nextInt();
            }
            System.out.println("");
        }
        
    }
    
}
