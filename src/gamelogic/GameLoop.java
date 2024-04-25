package gamelogic;

import java.util.Scanner;

public class GameLoop {

    public GameLoop(Player playerYellow, Player playerGreen, Player playerBlue,Player playerRed,Dice dice){
        Board b = new Board(playerYellow,playerGreen,playerBlue,playerRed);
        Player[] arr = new Player[]{playerYellow,playerGreen,playerBlue,playerRed};
        new Thread(()->{
            Scanner sc = new Scanner(System.in);
            while(true){
                for(Player player : arr){
                    System.out.println("Its " + player.getColor() +"s turn!");
                    int diceRoll = dice.rollTheDice();
                    System.out.println(player.getColor()+" rolled " + diceRoll);
                    System.out.println("Which Piece should be moved?");
                    int input = sc.nextInt();
                    b.movePiece(player.getPiece(input),diceRoll);
                    b.printBoard();
                }
            }
        }).start();
    }
}
