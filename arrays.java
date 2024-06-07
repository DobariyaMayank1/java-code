import java.util.*;

public class arrays {

    public static int[][] enter_matrix(int matrix[][]){
        Scanner sc = new Scanner(System.in);

        for (int i =0 ; i<matrix.length; i++){
            for (int j=0; j< matrix[0].length; j++){

                System.out.print("enter the value of matrix ["+i+", "+j+"]");

                 matrix[i][j] = sc.nextInt();

            }
        }
        return matrix;
    }

    public static int largestnum(int matrix[][]){
        int largest =Integer.MIN_VALUE;

        for (int i =0 ; i<matrix.length; i++){
            for (int j=0; j< matrix[0].length; j++){

                if (matrix[i][j] > largest){
                    largest= matrix[i][j];
                }

            }
        }
        return largest;

    }
    public static int smallestnum(int matrix[][]){
        int smallest =Integer.MAX_VALUE;

        for (int i =0 ; i<matrix.length; i++){
            for (int j=0; j< matrix[0].length; j++){

                if (matrix[i][j] < smallest){
                    smallest= matrix[i][j];
                }

            }
        }
        return smallest;

    }

    public static void print_matrix (int matrix[][]){
        System.out.println("matrix is :");
        for (int i =0 ; i<matrix.length; i++){
            for (int j=0; j< matrix[0].length; j++){

                System.out.print(matrix[i][j] +" ");

            }
            System.out.println();
        }

    }
    
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row in matrix :");
        int row = sc.nextInt();
        System.out.println("enter the number of column in matrix :");
        int column = sc.nextInt();

        int matrix[][]= new int [row][column];
        enter_matrix(matrix);
      
        print_matrix(matrix);

        System.out.println("largest number of matrix is :" +largestnum( matrix));
        System.out.println("smallest number of matrix is :" +smallestnum( matrix));
    }
    
}
