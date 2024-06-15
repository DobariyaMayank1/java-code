import java.util.*;

public class recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the any random integer number : ");
        int n = sc.nextInt();
        System.out.print("increasing order :");
        inc(n);
        System.out.println();
        System.out.print("decreasing order :");
        dec(n);
        System.out.println();
        System.out.println("factorial of number "+ n + " = "+ factorial(n));
       

    }

    public static int factorial(int n) {
        int fact = 1;
        if (n == 1) {

            fact = 1;
            return fact;
        }

        fact = factorial(n - 1) * n;

        return fact;
    }

    public static void inc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        inc(n - 1);
        System.out.print(n + " ");
    }

    public static void dec(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        dec(n - 1);
    }

}
