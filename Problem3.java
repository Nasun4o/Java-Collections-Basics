import java.util.Scanner;

/**
 * Created by PC-PC on 3/27/2016.
 */
public class Problem3 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String[] stringArray = console.nextLine().split(" ");
        int longesCount = 1;
        int currentCount = 1;
        String currentString = stringArray[0];
        String longestString = stringArray[0];
        for (int i = 1; i <stringArray.length ; i++) {

            if (stringArray[i].equals(stringArray[i - 1]) && i != stringArray.length -1){
                currentCount++;
            }else{
                if (stringArray[i].equals(currentString)){
                    currentCount++;
                }
                if (currentCount > longesCount){
                    longesCount = currentCount;
                    longestString = stringArray[i - 1];
                }

                currentCount = 1;
                currentString = stringArray[i];
            }
        }
        for (int i = 0; i < longesCount; i++) {
            System.out.println(longestString + " ");
        }
    }
}
