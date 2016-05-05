import java.util.Scanner;

/**
 * Created by PC-PC on 3/25/2016.
 */
public class Problem5
{
    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);

        String[] input = console.nextLine().split("(\\s+|\'|\\-)");
        int count = 0;
        for (int i = 0; i < input.length; i++) {

            count++;
        }

        System.out.println(count);
    }


}
