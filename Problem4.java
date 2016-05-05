import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by PC-PC on 3/27/2016.
 */
public class Problem4 {
    public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    String[] array = console.nextLine().split(" ");
    int[] parseNum = new int[array.length];
    for (int i = 0; i < parseNum.length; i++) {
        parseNum[i] = Integer.parseInt(array[i]);
    }

    int privious = 0;
    int current = 0;
    int maxLength = 0;
    int currLength = 0;
    int startIndex1 = 0;

    for (int i = 0; i < array.length; i++) {
        if (i == 0) {
            System.out.print(array[0] + " ");
            currLength++;
            continue;
        }

        privious = parseNum[i - 1];
        current = parseNum[i];

        if (current > privious) {
            currLength++;
            System.out.print(current + " ");

            if (currLength > maxLength) {
                maxLength = currLength;
                startIndex1 = i - maxLength + 1;
            }
        } else {
            System.out.println();
            System.out.print(current + " ");
            currLength = 1;
        }
    }

    if (maxLength == 1 || maxLength == 0) {
        System.out.print("Longest: " + array[0] + " ");
    } else {
        System.out.println();
        System.out.print("Longest: ");
        for (int i = 0; i < maxLength; i++) {
            System.out.print(array[startIndex1++] + " ");
        }
    }
}
}
