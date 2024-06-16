import java.util.*;

public class recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("enter the any random integer number : ");
        // int n = sc.nextInt();
        // System.out.print("increasing order :");
        // inc(n);
        // System.out.println();
        // System.out.print("decreasing order :");
        // dec(n);
        // System.out.println();
        // System.out.println("sum of first " + n + " number = " + sum(n));
        // System.out.println("factorial of first " + n + " number = " + factorial(n));
        // System.out.println(n +"th fibonacci number is : " +fibonacci(n));
        int arr [] = {1,2,5,3,5,4};
        // System.out.println(issorted(arr, n));

        int key = 5;
        System.out.println(firstOccurence(arr, key, 0));
        System.out.println(lastOccurence(arr, key, arr.length-1));
    }



    public static int lastOccurence(int arr[], int key , int i ){
        if (arr.length == 0){
            return -1;
        }
        if (arr[i]== key ){
            return i;
        }
        return lastOccurence(arr, key, i-1);

    }
    public static int firstOccurence(int arr[], int key, int i ){
        if (arr.length -1 <i){
            return -1;
        }
        if (arr[i]== key ){
            return i;
        }
        return firstOccurence(arr, key, i+1);

    }

    public static boolean issorted(int arr[],int i){
        if (arr.length -1 ==i){
            return true;
        }
        if (arr[i]> arr[i+1]){
            return false;
        }
        return issorted(arr, i+1);
    }

    public static int fibonacci(int i ){
        if (i <= 1){
            return i;
        } 

        return fibonacci(i-1 ) + fibonacci(i-2);
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
    public static int sum(int n) {
        // int fact = 1;
        if (n == 1) {

             int sum = 1;
            return sum;
        }

        int sum  = sum(n - 1) + n;

        return sum;
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
