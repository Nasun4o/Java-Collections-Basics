import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by PC-PC on 3/27/2016.
 */
public class Problem1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int numberCount = console.nextInt();
        int[] array = new int[numberCount];

        for (int i = 0; i < numberCount; i++) {
            array[i] = console.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
}
