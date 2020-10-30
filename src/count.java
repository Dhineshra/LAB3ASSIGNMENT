
/*
*Desc: To count the number of lines, characters and numbers
*Author: Dhinesh R
*
*/
import java.util.Scanner;

public class count {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int Char = 0, Word = 0, Line = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ')
                Char++;
            if (str.charAt(i) == ' ')
                Word++;
            if (str.charAt(i) == '.')
                Line++;
        }
        System.out.println("characters:" + Char);
        System.out.println("Words:" + (Word + 1));
        System.out.println("Lines:" + Line);

    }

}