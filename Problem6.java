import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by PC-PC on 3/25/2016.
 */
public class Problem6 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String[] text = console.nextLine().toLowerCase().split("(\\s+|\'|\\-)");
        String wordToMatch = console.nextLine();
        int count = 0;

        for (int i = 0; i < text.length; i++) {

            if (text[i].equals(wordToMatch)){
                count++;
            }
        }
        System.out.println(count);
    }
}
