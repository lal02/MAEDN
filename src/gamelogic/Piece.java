package gamelogic;

public class Piece {
    public String color;
    public final int id;

    public Piece(String color,int id){
        this.color = color;
        this.id = id;

    }

    @Override
    public String toString(){
        String s = "";
        return s+=color +id;
    }

}
