public class butterfly {

    public static void main(String[] args) {
        // star (4);
        butterfly(4);
    }

public static void butterfly (int n ){
    for (int i=1; i<=n;i ++ ){

        for (int j= 1; j<= i ; j++){
            System.out.print("*");
        }
        for (int j= 1; j<=  2*(n-i); j++ ){
            System.out.print(" ");
        }
        for (int j= 1; j<= i ; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for (int i=n; i>=1;i-- ){

        for (int j= 1; j<= i ; j++){
            System.out.print("*");
        }
        for (int j= 1; j<=  2*(n-i); j++ ){
            System.out.print(" ");
        }
        for (int j= 1; j<= i ; j++){
            System.out.print("*");
        }
        System.out.println();
    }
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
