
/*
*Desc: To check the difference between the numbers of the given input
*Author: Dhinesh R
*
*/
import java.util.Scanner;

public class Difference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        modifyNumber(number);
    }

    public static void modifyNumber(int number) {
        int difference = 0;
        String str = String.valueOf(number);
        char result[] = str.toCharArray();
        for (int i = 0; i < result.length - 1; i++) {
            difference = (Math.abs(result[i] - result[i + 1]));
            System.out.print(difference);
        }

    }

}