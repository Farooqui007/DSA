import java.util.*;

public class RomanToInteger {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int sum = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (i + 1 < n && roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                sum -= roman.get(s.charAt(i)); // subtract current value
            } else {
                sum += roman.get(s.charAt(i)); // add current value
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roman numeral: ");
        String s = sc.nextLine().toUpperCase(); // ensure uppercase input
        int result = romanToInt(s);
        System.out.println("Integer value: " + result);
    }
}

