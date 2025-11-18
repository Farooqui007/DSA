import java.util.*;
public class climbStairs {
    public  static int fib(int n){
        if( n <=1 ){
            return 1;
    }
    return fib(n-1) + fib(n-2);
}
    public static void  main(String arg []){
        Scanner sc= new Scanner(System.in);
        System.out.println("print the number of stairs :");
        int n = sc.nextInt();
        int a = fib(n);
        System.out.println(a);
    }
}
