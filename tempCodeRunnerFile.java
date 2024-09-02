
        int n =4;
         char board[][] = new char[n][n];
         for (int i =0; i<n ; i++){
            for (int j =0; j<n ; j++){
                board[i][j] = 'X';
            }
         }
        nQueens(board, 0); 