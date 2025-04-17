

public class Main {
  public static void main(String[] args) {
    TicTacToe ttt = new TicTacToe();


    ttt.placeCharOnIndex('x', 0, 0);
    ttt.placeCharOnIndex('x', 1, 1);
    ttt.placeCharOnIndex('x', 2, 2);
    ttt.placeCharOnIndex('x', 2, 0);
    ttt.placeCharOnIndex('x', 0, 2);
    
    ttt.printMap(0,0);

    if (ttt.checkWin('x')) {
      System.out.println("Player x has won!");
    } else {
      System.out.println("Son is not winning");
    }

  }
}