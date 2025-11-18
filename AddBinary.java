import java.util.*;

public class AddBinary {
    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 && j >= 0) {
            int n = (a.charAt(i) - '0') + (b.charAt(j) - '0') + carry;
            switch (n) {
                case 0: sb.insert(0, '0'); carry = 0; break;
                case 1: sb.insert(0, '1'); carry = 0; break;
                case 2: sb.insert(0, '0'); carry = 1; break;
                case 3: sb.insert(0, '1'); carry = 1; break;
            }
            i--;
            j--;
        }

        while (i >= 0) {
            int n = (a.charAt(i) - '0') + carry;
            switch (n) {
                case 0: sb.insert(0, '0'); carry = 0; break;
                case 1: sb.insert(0, '1'); carry = 0; break;
                case 2: sb.insert(0, '0'); carry = 1; break;
            }
            i--;
        }

        while (j >= 0) {
            int n = (b.charAt(j) - '0') + carry;
            switch (n) {
                case 0: sb.insert(0, '0'); carry = 0; break;
                case 1: sb.insert(0, '1'); carry = 0; break;
                case 2: sb.insert(0, '0'); carry = 1; break;
            }
            j--;
        }

        if (carry == 1) {
            sb.insert(0, '1');
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first binary number: ");
        String a = sc.nextLine();
        System.out.print("Enter second binary number: ");
        String b = sc.nextLine();

        System.out.println("Sum: " + addBinary(a, b));
    }
}
