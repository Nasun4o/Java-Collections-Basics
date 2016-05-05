import java.util.Scanner;

/**
 * Created by PC-PC on 3/27/2016.
 */
public class Problem2 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String[] array = console.nextLine().split(" ");
        System.out.println(array[0] + " ");
        for (int i = 1; i < array.length; i++) {

            if (array[i].equals(array[i - 1])){
                System.out.println(array[i] + " ");
            }else{
                System.out.println(array[i]+ " ");
            }
        }
    }
}
