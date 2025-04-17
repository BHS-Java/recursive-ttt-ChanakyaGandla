public class TicTacToe {
  private char[][] board;
  private char currentPlayer;

  private Scanner scan 

  public TicTacToe() {
      board = new char[3][3];
      currentPlayer = 'X';
      for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
              board[i][j] = ' ';
          }
      }
  }


  public void printMap(int x, int y) {
    if (y <= board.length-1 && x <= board[0].length-1) {
    
        System.out.print("[ " + board[y][x] + " ]");
        if (x == board[0].length-1) {
            System.out.println("");
            printMap(0, y+1);
        } else {
            printMap(x+1, y);
        }
    }
    
  }
  public void playGame() {
      
  }

  public void placeCharOnIndex(char p, int x, int y) {
    if (board != null) {
        char index = board[y][x];
        if (index == ' ') {
            board[y][x] = p;
        } else {
            System.out.println("Index is already occupied! Try again.");
        }
    } else {
        System.out.println("Board does not exist! Try again.");
    }
  }

  public boolean checkWin(char player) {
    // only checks diagonals at the moment, update for other checks later.
    return checkLine(0, 0, new int[] {1, 1}, player) 
    || checkLine(0, 2, new int[] {-1, 1}, player);
  }

  // slope[0] is x increment, slope[1] is y increment
  public boolean checkLine(int x, int y, int[] slope, char c) {
    if (y > board.length-1 || x > board[0].length-1) {
        // if index is null
        return true;
    }
    if (board[y][x] == c) {
        System.out.println("Checked " + x + " " + y + " " + board[y][x]);
        return checkLine(y + slope[1], x + slope[0], slope, c);
    } else {
        return false;
    }
  }
}