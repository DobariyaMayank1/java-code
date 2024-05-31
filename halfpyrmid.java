

public class halfpyrmid {

    public static void pattern21(int n ){
        for (int i = 1 ; i <= n ; i++){
            for (int j= 1; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void pattern11(int n ){

        for (int i = 1 ; i <= n ; i++){
            for (int j= 1; j<=n-i+1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void pattern12(int n ){

        for (int i = 1 ; i <=n ; i++){
            for(int j=1 ; j<=i-1 ; j++ ){
                System.out.print(" ");
                
            }
            for(int j=1 ; j<= n-i+1 ; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void pattern22(int n ){

        for (int i = 1 ; i <=n ; i++){
            for(int j=1 ; j<= n-i ; j++ ){
                System.out.print(" ");
            }
            for(int j=1 ; j<= i ; j++ ){
                System.out.print("*");

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n = 3;

        pattern12(n);
        pattern22(n);
        pattern11(n);
        pattern21(n);

    }

}