import java.util.*;

public class recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number that you want to print in decreasing order");
        int n = sc.nextInt();
        dec(n);
        System.out.println();
        inc(n);

    }

    public static void inc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        inc(n-1);
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
