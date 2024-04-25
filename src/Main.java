import gamelogic.*;

public class Main {
    public static void main(String[] args) {

        Dice d = new Dice();

        Player yellow = new Player("yellow");
        Player green = new Player("green");
        Player blue = new Player("blue");
        Player red = new Player("red");

        Board b = new Board(yellow, green, blue, red);
        b.printBoard();
//        new GameLoop(yellow,green,blue,red,d);
    }
}
