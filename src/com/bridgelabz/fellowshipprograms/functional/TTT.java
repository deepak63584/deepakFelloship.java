package com.bridgelabz.fellowshipprograms.functional;

import java.io.Console;
import java.util.Scanner;

public class TTT 
{
	 static Scanner s = new Scanner(System.in);
	       /* TicTacToe t = new TicTacToe();
	        
	        int x=0,y=0;
	        do
	        {
	            System.out.println(t.player==t.X?"Player X turn":"Player O turn");
	            System.out.println("Enter x and y places");
	            x=s.nextInt();
	            y=s.nextInt();
	              
	            t.putSign(x, y);
	            System.out.println(t.toString());
	            System.out.println("_____________________________");
	            t.displayWinner();
	              
	        }while(t.isEmpty);
	    }
	}
	  
	class TicTacToe
	{
	    public static final int X = 1, O = -1;
	    public static final int EMPTY = 0;
	      
	    public int player = X;
	    private int[][] board = new int[3][3];
	    public boolean isEmpty = false;
	      
	   //Puts an X or O mark at position i,j. 
	    public void putSign(int x, int y)
	    {
	        if(x<0 || x>2 || y<0 || y>2)
	        {
	            System.out.println("Invalid board position");
	            return;
	        }
	        if(board[x][y] != EMPTY)
	        {
	            System.out.println("Board position occupied");
	            return;
	        }
	        board[x][y] = player;   // place the mark for the current player
	        player = -player;       // switch players (uses fact that O = - X)
	    }
	      
	    //Checks whether the board configuration is a win for the given player. 
	    public boolean isWin(int player)
	    {
	        return ((board[0][0] + board[0][1] + board[0][2] == player*3) ||
	                (board[1][0] + board[1][1] + board[1][2] == player*3) ||
	                (board[2][0] + board[2][1] + board[2][2] == player*3) ||
	                (board[0][0] + board[1][0] + board[2][0] == player*3) ||
	                (board[0][1] + board[1][1] + board[2][1] == player*3) ||
	                (board[0][2] + board[1][2] + board[2][2] == player*3) ||
	                (board[0][0] + board[1][1] + board[2][2] == player*3) ||
	                (board[2][0] + board[1][1] + board[0][2] == player*3));
	    }
	      
	    //display the winning player or indicate a tie (or unfinished game).
	    public void displayWinner()
	    {
	        if(isWin(X))
	        {
	            System.out.println("\n X wins...!!");
	            isEmpty=false;
	        }
	        else if(isWin(O))
	        {
	            System.out.println("\n O wins...!!");
	            isEmpty=false;
	        }
	        else
	        {
	            if(!isEmpty)
	            {
	                System.out.println("its a tie");
	            }
	              
	        }
	    }
	      
	    public String toString()
	    {
	        StringBuilder s = new StringBuilder();
	        isEmpty = false;
	        for(int i=0;i<3;i++)
	        {
	            for(int j=0;j<3;j++)
	            {
	                switch(board[i][j])
	                {
	                case X:
	                    s.append(" X ");
	                    break;
	                case O:
	                    s.append(" O ");
	                    break;
	                case EMPTY:
	                    s.append("   ");
	                    isEmpty=true;
	                    break;
	                }
	                if(j<2)
	                {
	                    s.append("|");
	                }
	                  
	            }
	            if(i<2)
	            {
	                s.append("\n-----------\n");
	            }
	        }
	        return s.toString();
	  }
	  
	  
	  //2nd method-
		  static final int EMPTY = 0;
		    static final int NONE = 0;
		    static final int USER = 1;
		    static final int COMPUTER = 2;
		    static final int STALEMATE = 3;

		    public static void main(String[] args) {
			// Data objects
			// 1 = user, 2 = computer
			int turn = USER;

			// We will represent the board as nine cells 
		        // 0 = empty, 1 = user, 2 = computer
			int[][] board = new int[3][3];

			// move: 1-9 representing ul through lr
			int move;

			// winner: 0 = none, 1 = user, 2 = computer, 3 = stalemate
			int winner;

			// Print Instructions
		        System.out.println("This is a tic-tac-toe game");
			System.out.println("You are playing against the computer!");
			System.out.println("Enter 1-9 to indicate your move");

			// Print the board
			print_board(board);

			// While (game not over)
			while(true) {
			    if(turn == USER) {
				System.out.println("Your move");
				move = -1;
				while (move<0 || move>9 || board[move/3][move%3] != EMPTY) {
				    System.out.println("Please enter your move(0-9): ");
				    move = s.nextInt();
				}
			    } else {
				move = computer_move(board);
				System.out.println("Computer move: " + move);
			    }

			    // Update the board
			    board[(int)(move/3)][move%3] = turn;

			    // Print the board
			    print_board(board);

			    // if game is over
			    winner = checkWinner(board);

			    if(winner != NONE)
				break;

			    // switch turn
			    if(turn == USER) {
				turn = COMPUTER;
			    } else {
				turn = USER;
			    }

			}

			// Print out the outcome
			switch(winner) {
			case USER:
			    System.out.println("You won!");
			    break;
			case COMPUTER: 
			    System.out.println("Computer won!");
			    break;
			default:
			    System.out.println("Tie!");
			    break;
			}
		    }

		    // Print the board
		    public static void print_board(int[][] board) {
			System.out.print(printChar(board[0][0]));
			System.out.print("|");
			System.out.print(printChar(board[0][1]));
			System.out.print("|");
			System.out.println(printChar(board[0][2]));
			System.out.println("-----");
			System.out.print(printChar(board[1][0]));
			System.out.print("|");
			System.out.print(printChar(board[1][1]));
			System.out.print("|");
			System.out.println(printChar(board[1][2]));
			System.out.println("-----");
			System.out.print(printChar(board[2][0]));
			System.out.print("|");
			System.out.print(printChar(board[2][1]));
			System.out.print("|");
			System.out.println(printChar(board[2][2]));
		    }

		    // Return an X or O, depending upon whose move it was
		    public static char printChar(int b) {
			switch(b) {
			case EMPTY:
			    return ' ';
			case USER:
			    return 'X';
			case COMPUTER:
			    return 'O';
			}
			return ' ';
		    }

		    // See if the game is over
		    public static int checkWinner(int[][] board) {
			// Check if someone won
			// Check horizontals

			// top row
			if((board[0][0] == board[0][1]) && (board[0][1] == board[0][2]))
			    return board[0][0];

			// middle row
			if((board[1][0] == board[1][1]) && (board[1][1] == board[1][2]))
			    return board[1][0];

			// bottom row
			if((board[2][0] == board[2][1]) && (board[2][1] == board[2][2]))
			    return board[2][0];

			// Check verticals

			// left column
			if((board[0][0] == board[1][0]) && (board[1][0] == board[2][0]))
			    return board[0][0];

			// middle column
			if((board[0][1] == board[1][1]) && (board[1][1] == board[2][1]))
			    return board[0][1];

			// right column
			if((board[0][2] == board[1][2]) && (board[1][2] == board[2][2]))
			    return board[0][2];

			// Check diagonals
			// one diagonal
			if((board[0][0] == board[1][1]) && (board[1][1] == board[2][2]))
			    return board[0][0];

			// the other diagonal
			if((board[0][2] == board[1][1]) && (board[1][1] == board[2][0]))
			    return board[0][2];

			// Check if the board is full
			if(board[0][0] == EMPTY || 
		       board[0][1] == EMPTY || 
		       board[0][2] == EMPTY || 
			   board[1][0] == EMPTY ||
			   board[1][1] == EMPTY ||
			   board[1][2] == EMPTY ||
			   board[2][0] == EMPTY ||
			   board[2][1] == EMPTY ||
			   board[2][2] == EMPTY)
			    return NONE;

			return STALEMATE;
		    }

		    // Generate a random computer move
		    public static int computer_move(int[][] board) {
			int move = (int)(Math.random()*9);

			while(board[move/3][move%3] != EMPTY) 
			    move = (int)(Math.random()*9);

			return move;
		    }*/
	 
	 
	 //3rd method-
	 private String[][] board; 
	    static String X = "X";
	    static String O = "O";    
	    public TTT()
	    {
	        board = new String[3][3]; 
	    }
	    public void printBoard()
	    {
	        System.out.println();
	        for (int i = 0; i < board.length; i++) {
	            for (int j = 0; j < board[i].length; j++) {
	                if (board[i][j] == null) {
	                    System.out.print("_");
	                } else {
	                    System.out.print(board[i][j]);
	                }
	                if (j < 2) {
	                    System.out.print("|");
	                } else {
	                    System.out.println();
	                } 
	             }
	         }
	         System.out.println();
	    }
	    public Boolean checkWinner(String play) {
	        int playInRow = 0;
	        int playD1 = 0;
	        int playD2 = 0;
	        int[] playInColumn = new int[board[0].length];   // assumes square board
	        for (int i = 0; i < board.length; i++) {
	            playInRow = 0;
	            for (int j = 0; j < board[i].length; j++) {
	                if (null == board[i][j]) {
	                    continue;
	                }
	                if (board[i][j].equals(play)) {
	                    playInRow++;
	                    playInColumn[j]++;
	                    if (i == j) {
	                        playD1++;
	                    } else if (2 == i + j) {
	                        playD2++;
	                    }
	                }
	            }
	            if (playInRow == 3) {
	                return true;
	            }
	        }
	        if (3 == playD1 || 3 == playD2) {
	            return true;
	        }
	        for (int i = 0; i < playInColumn.length; i++) {
	            if (playInColumn[i] == 3) {
	                return true;
	            }
	        }
	        return false;    
	    }
	    public void makeMove(Scanner stdin, String play) {
	        int r;
	        int c;
	        Boolean goodInput = false;
	        while(!goodInput) {
	            r = -1;
	            c = -1;
	            System.out.println ("Enter coordinates to play your " + play);
	            if (stdin.hasNextInt()) {  // must be integers
	                r = stdin.nextInt();
	            }
	            if (stdin.hasNextInt()) {
	                c = stdin.nextInt();
	            }
	            else {
	                stdin.nextLine();      // consume a line without an integer
	                System.out.println("Both inputs must be integers between 0 and 2.");
	                continue;
	            }
	            // must be in the right coordinate range
	            if ((r < 0) || (r > 2) || (c < 0) || (c > 2)) {
	                System.out.println("Both inputs must be integers between 0 and 2.");
	                continue;                
	            } 
	            // make sure the space is not occupied
	            else if (board[r][c] != null ){  
	                System.out.println("That location is occupied");
	                continue; 
	            }
	            else {
	                board[r][c] = play;
	                return;
	            }
	        }
	        return;
	    }
	    public static void main(String[] args) {
	        TTT ttt = new TTT();            
	        Scanner stdin = new Scanner(System.in); 
	        int moves = 0;
	        System.out.println("Let's play TicTacToe -- X goes first");
	        ttt.printBoard();
	        while (moves < 9) {
	            ttt.makeMove(stdin, ttt.X);
	            moves++;
	            if (moves > 4) {
	                if (ttt.checkWinner(X)) {
	                   System.out.println(X + " You Win!!!");
	                   break;
	                }
	            }
	            ttt.printBoard();
	            ttt.makeMove(stdin, ttt.O);
	            moves++;
	            if (moves > 4) {
	                if (ttt.checkWinner(O)) {
	                   System.out.println(O + " You Win!!!");
	                   break;
	                }
	            }
	            ttt.printBoard();
	        }
	    }
}
