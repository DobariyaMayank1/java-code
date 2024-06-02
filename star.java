import java.util.*;
public class star {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to print the line of star :");
        int n = sc.nextInt();
        star (n);
    }


    public static void star (int n ){
        for (int i = 1; i <= n ; i++ ){
            for (int j=1; j <= n-i ; j++){
                System.out.print(" ");
            }
            for(int j= 1; j <= (2*i )-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1 ; i-- ){
            for (int j=1; j <= n-i ; j++){
                System.out.print(" ");
            }
            for(int j= 1; j <= (2*i )-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    
}
