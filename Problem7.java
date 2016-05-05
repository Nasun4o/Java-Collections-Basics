import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by PC-PC on 3/25/2016.
 */
public class Problem7 {
    public static void main(String[] args) {
//        Scanner console = new Scanner(System.in);
//        char[] text1 = console.nextLine().toCharArray();
//        char[] text2 = console.nextLine().toCharArray();
//
//        List<Character> array = new ArrayList<>();
//
//        for (int i = 0; i < text1.length; i++) {
//            array.add(text1[i]);
//
//        }
//
//        for (int i = 0; i < array.size() + text2.length; i++) {
//
//            if (array.equals(text2[i])){
//                System.out.println(text2[i]);
//            }
//        }
//
//
//        System.out.println(text1);

        Scanner console = new Scanner(System.in);
        char[] lineInputOne = console.nextLine().toCharArray();
        List<Character> lineOne = new ArrayList<>();

        for (int i = 0; i < lineInputOne.length; i++) {
            lineOne.add(lineInputOne[i]);
        }

        char[] lineInputTwo = console.nextLine().toCharArray();
        List<Character> lineTwo = new ArrayList<>();

        for (int i = 0; i < lineInputTwo.length; i++) {
            lineTwo.add(lineInputTwo[i]);
        }

        List<Character> output = lineOne;

        for (int i = lineOne.size() - 1; i > 0; i--) {
            if (lineOne.get(i).equals(lineTwo.get(0))) {
                output.addAll(lineTwo);
                break;
            }
        }

        System.out.print(output);
    }
}