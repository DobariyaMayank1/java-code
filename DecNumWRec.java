import java.util.Scanner;

public class DecNumWRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number that you want to print in decreasing order");
        int n = sc.nextInt();
        dec(n);



    }
    public static void dec(int n ){
        if (n== 1){
            System.out.print(n );
            return;
        }
        System.out.print(n +" ");
        dec(n-1);
    }

}

