/*
*Desc: To replace the next consonant of the given string
*Author: Dhinesh
*/
public class Nextresonant {

    static boolean isVowel(char ch) {
        if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
            return false;
        }
        return true;
    }

    static String replaceConsonants(char[] s) {
        for (int i = 0; i < s.length; i++) {
            if (!isVowel(s[i])) {

                if (s[i] == 'z') {
                    s[i] = 'b';
                }

                else {

                    s[i] = (char) (s[i] + 1);

                    if (isVowel(s[i])) {
                        s[i] = (char) (s[i] + 1);
                    }
                }
            }
        }
        return String.valueOf(s);
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(replaceConsonants(s.toCharArray()));
    }
}