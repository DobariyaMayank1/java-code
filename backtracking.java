public class backtracking {

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void changearr(int arr[], int i, int value) {

        if (i == arr.length) {
            printarr(arr);
            return;
        }

        arr[i] = value;
        changearr(arr, i + 1, value + 1);
        arr[i] = value - 2;

    }

    public static void findsubsets(String str, String ans, int i) {

        if (i == str.length()) {

            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        findsubsets(str, ans+str.charAt(i), i + 1);

        findsubsets(str, ans, i + 1);

    }

    public static void findpermutation(String str, String ans){

        if (str.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i =0;i< str.length(); i++ ){
            char curr = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i+1);
            findpermutation(newstr, ans+curr);
        }

    }

    public static void nQueens(char board[][], int row){
        if (row == board.length){
            printboard(board);
            return;
        }
        for (int j =0 ; j<board.length; j++){
            if (issafe (board,row,j)){
                board [row][j]= 'Q';
                nQueens(board, row+1);
                board[row][j]='X';
            }
        }
    }

    public static void printboard(char board [][]){
        System.out.println("______________________________");
        for(int i = 0; i<board.length; i++){
            for (int j= 0; j< board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean issafe (char board[][], int row,int col) {
        for (int i =row-1; i>=0; i--){
            if (board [i][col] == 'Q'){
                return false;
            }
        }

        for (int i = row -1, j = col-1; i>=0 && j>= 0 ; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

         for (int i = row-1 , j= col+1; i>=0 && j<board.length; i-- , j++){
            if(board[i][j] == 'Q'){
                return false;
            }
         }
         return true;
    }

    public static void main(String[] args) {

        int n =4;
         char board[][] = new char[n][n];
         for (int i =0; i<n ; i++){
            for (int j =0; j<n ; j++){
                board[i][j] = 'X';
            }
         }
        nQueens(board, 0);         

        // String str = "xyz";
        // findpermutation(str, "");

        // findsubsets(str, "", 0);

        // int arr[] = new int[5];

        // changearr(arr, 0, 1);
        // printarr(arr);

    }
}
