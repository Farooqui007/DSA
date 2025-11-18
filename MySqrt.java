import java.util.*;

public class MySqrt {
    public static int mySqrt(int x) {
        long l = 0;
        long r = x;
        long m;

        while (l <= r) {
            m = (l + r) / 2;
            if (m * m > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return (int) r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        System.out.println("Square root: " + mySqrt(x));
    }
}
