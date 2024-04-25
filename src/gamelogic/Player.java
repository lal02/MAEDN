package gamelogic;

public class Player {
    private final String color;
    public final Piece pieceOne, pieceTwo, pieceThree, pieceFour;

    public Player(String color){
        this.color = color;
        pieceOne = new Piece(color,1);
        pieceTwo = new Piece(color,2);
        pieceThree = new Piece(color,3);
        pieceFour = new Piece(color,4);
    }

   public Piece getPiece(int id){
       return switch (id) {
           case 1 -> pieceOne;
           case 2 -> pieceTwo;
           case 3 -> pieceThree;
           case 4 -> pieceFour;
           default -> null;
       };
   }

    public String getColor() {
        return color;
    }
}
