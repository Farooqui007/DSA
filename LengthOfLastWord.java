import java.util.*;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int sol = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                sol++;
            } else if (i + 1 < s.length() && s.charAt(i + 1) != ' ') {
                sol = 0;
            }
        }
        return sol;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();
        System.out.println("Length of last word: " + lengthOfLastWord(s));
    }
}

