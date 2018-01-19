class TicTacToe
 {
     private static final int ROW = 3;
     private static final int COL = 3;
     public static int count = 0; 
     int[][] board;

     TicTacToe()
     {
         board = new int[ROW][COL];
         for (int i = 0; i < ROW; i++)
         {
             for (int x = 0; x < COL; x++)
             {
                 board[i][i] = 0;
             }
         }
     }

     void Display() {
         for (int i = 0; i < ROW; i++)
         {
             for (int x = 0; x < COL; x++)
             {
                 if (i == 0)
                 {
                     if(board[i][x] == 1)
                     {
                         System.out.print("X    ");
                     }
                     else if(board[i][x] == 2)
                     {
                         System.out.print("O    ");
                     }
                     else
                     {
                         System.out.print(" ");
                     }
                 }
                 else if (i == 1)
                 {
                     if (x == 0)
                     {
                         System.out.println();
                         if(board[i][x] == 1)
                         {
                             System.out.print("X    ");
                         }
                         else if(board[i][x] == 2)
                         {
                             System.out.print("O    ");
                         }
                         else
                         {
                             System.out.print("     ");
                         }
                     }
                     else
                     {
                         if(board[i][x] == 1)
                         {
                             System.out.print("X    ");
                         }
                         else if(board[i][x] == 2)
                         {
                             System.out.print("O    ");
                         }
                         else
                         {
                             System.out.print("     ");
                         }
                     }
                 }
                 else
                     {
                     if (x == 0)
                     {
                         System.out.println();
                         if(board[i][x] == 1)
                         {
                             System.out.print("X    ");
                         }
                         else if(board[i][x] == 2)
                         {
                             System.out.print("O    ");
                         }
                         else
                         {
                             System.out.print("     ");
                         }
                     }
                     else
                     {
                         if(board[i][x] == 1)
                         {
                             System.out.print("X    ");
                         }
                         else if(board[i][x] == 2)
                         {
                             System.out.print("O    ");
                         }
                         else
                         {
                             System.out.print("     ");
                         }
                     }
                 }
             }
         }
     }

     void playerOneMove(int row, int col)
	{
		int move = 0; 
		if(board[row][col] == 0)
		{
		board[row][col] = 1;
		count++;
		}
		else
		{
		System.out.print("The spot is already taken try again");
		}
	}
     void playerTwoMove(int row, int col) {
	int move = 0; 
         if (board[row][col] == 0)
	 {
       	     board[row][col] = 2;
	     count++; 		
         } else 
	{
             System.out.println("The spot is already taken try again");
         }
     }

     void gameStatus() {
         int horizontalP1 = 0;
         int diagonalP1 = 0;
         int horizontalP2 = 0;
         int diagonalP2 = 0;
         int verticalP1 = 0;
         int verticalP2 = 0;
	 int draw = 0; 

         for (int i = 0; i < COL; i++)
         {
             if (board[0][i] == 1 && board[1][i] == 1 && board[2][i] == 1) // HORIZONTAL PLAYER 1
             {
                 verticalP1 = 1;
             }
             else if (board[0][i] == 2 && board[1][i] == 2 && board[2][i] == 2)
             {
                 verticalP2 = 2;
             }
             else if(board[i][0] == 1 && board[i][1] == 1 && board[i][2] == 1)
             {
                 horizontalP1 = 1;
             }
             else if(board[i][0] == 2 && board[i][1] == 2 && board[i][2] == 2)
             {
                 horizontalP2 = 2;
             }
             else if ((board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1) || (board[0][2] == 1 && board[1][1] == 1 && board[2][0] == 1))
             {
                 diagonalP1 = 1;
             }
             else if ((board[0][0] == 2 && board[1][1] == 2 && board[2][2] == 2) || (board[0][2] == 2 && board[1][1] == 2 && board[2][0] == 2))
             {
                 diagonalP2 = 2;
             }
		else
		{
		draw = 3;
		}
         }
         if(horizontalP1 == 1 || verticalP1 == 1 || diagonalP1 == 1)
         {
             System.out.println("Player one has won");
         }
         else if(horizontalP2 == 2 || verticalP2 == 2 || diagonalP2 == 2)
         {
             System.out.println("Player two has won");
         }
	else if(count == 9)
	{
		System.out.println("It's a draw");
	}
	else
	{
		System.out.print("The game is still going!");
	}
     }
 }


class Test
{
     public static void main(String[] args)
    {
        TicTacToe game = new TicTacToe();
	game.playerOneMove(0,0);
	game.playerTwoMove(0,1);
	game.playerOneMove(0,2);
	game.playerTwoMove(1,0);
	game.playerOneMove(1,1);
	game.playerTwoMove(1,2);
	game.playerTwoMove(2,0); 
	game.playerOneMove(2,1);
	game.playerTwoMove(2,2); 
	game.Display(); 
	game.gameStatus(); 

    }
}

