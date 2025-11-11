import java.util.*;

public class FindSubstring {
    public static int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i, i + needle.length()).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string (haystack): ");
        String haystack = sc.nextLine();
        System.out.print("Enter the substring to find (needle): ");
        String needle = sc.nextLine();

        int index = strStr(haystack, needle);
        if (index != -1)
            System.out.println("Substring found at index: " + index);
        else
            System.out.println("Substring not found.");
    }
}
