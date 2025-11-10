import java.util.*;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        char[] a = String.valueOf(x).toCharArray();
        int n = a.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (a[i] == a[j]) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        if (isPalindrome(x)) {
            System.out.println(x + " is a palindrome.");
        } else {
            System.out.println(x + " is not a palindrome.");
        }
    }
}
