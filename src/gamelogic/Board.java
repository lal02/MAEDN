package gamelogic;

public class Board {

    private Piece[] board = new Piece[40];

    private Piece[] yellowBase = new Piece[4];
    private Piece[] greenBase = new Piece[4];
    private Piece[] blueBase = new Piece[4];
    private Piece[] redBase = new Piece[4];

    private Piece[] yellowFinish = new Piece[4];
    private Piece[] greenFinish = new Piece[4];
    private Piece[] blueFinish = new Piece[4];
    private Piece[] redFinish = new Piece[4];

    public Board(Player playerYellow, Player playerGreen, Player playerBlue,Player playerRed){
        //initialize starting position
        yellowBase[0] = playerYellow.getPiece(1);
        yellowBase[1] = playerYellow.getPiece(2);
        yellowBase[2] = playerYellow.getPiece(3);
        yellowBase[3] = playerYellow.getPiece(4);

        greenBase[0] = playerGreen.getPiece(1);
        greenBase[1] = playerGreen.getPiece(2);
        greenBase[2] = playerGreen.getPiece(3);
        greenBase[3] = playerGreen.getPiece(4);

        blueBase[0] = playerBlue.getPiece(1);
        blueBase[1] = playerBlue.getPiece(2);
        blueBase[2] = playerBlue.getPiece(3);
        blueBase[3] = playerBlue.getPiece(4);

        redBase[0] = playerRed.getPiece(1);
        redBase[1] = playerRed.getPiece(2);
        redBase[2] = playerRed.getPiece(3);
        redBase[3] = playerRed.getPiece(4);
    }

    public void movePiece(Piece piece, int distance){
        int currentPosition = getPiecePosition(piece);
        board[currentPosition] = null;
        board[currentPosition+distance] = piece;
    }

    private int getPiecePosition(Piece p){
        //todo add from base position logic -> -1,-2 => if negative in move piece then from base? starting bases and finish bases each one array instead of for each color?
        for(int i = 0; i < board.length; i++){
            if(board[i] == p){
                return i;
            }
        }
        return -1;
    }



    public void printBoard(){
        StringBuilder sb = new StringBuilder();
        /*
            00  00S  00
            00  0F0  00
                0F0
                0F0
            S0000F00000
            0FFFF FFFF0
            00000F0000S
                0F0
                0F0
            00  0F0  00
            00  S00  00
         */
        //first row

        sb.append(""+greenBase[0] +greenBase[1] + "  " + board[18]+board[19]+board[20] + "  " + blueBase[0]+blueBase[1]);
        sb.append("\n");
        sb.append(""+greenBase[2] +greenBase[3] + "  " + board[17]+blueFinish[0]+board[21] + "  " + blueBase[2]+blueBase[3]);
        sb.append("\n");
        sb.append("    " + board[16] + blueFinish[1]+board[22]+"    ");
        sb.append("\n");
        sb.append("    " + board[15] + blueFinish[2]+board[23]+"    ");
        sb.append("\n");
        sb.append(""+ board[10] + board[11] + board[12] + board[13] + board[14] + blueFinish[3] + board[24]+board[25]+board[26]+board[27]+board[28]);
        sb.append("\n");
        sb.append(""+board[9] + greenFinish[0]+greenFinish[1]+greenFinish[2]+greenFinish[3] + " " + redFinish[3] + redFinish[2] + redFinish[1] + redFinish[0] + board[29]);
        sb.append("\n");
        sb.append(""+ board[8] + board[7] + board[6] + board[5] + board[4] + yellowFinish[3] + board[34] + board[33]+board[32]+board[31]+board[30]);
        sb.append("\n");
        sb.append("    " + board[3]+yellowFinish[2]+board[35] + "    ");
        sb.append("\n");
        sb.append("    " + board[2] + yellowFinish[1]+board[36]+"    ");
        sb.append("\n");
        sb.append("" + yellowBase[0]+yellowBase[1]+"  "+board[1]+yellowFinish[0]+board[37]+"  " + redBase[0] + redBase[1]);
        sb.append("\n");
        sb.append(""+yellowBase[2]+yellowBase[3]+"  "+board[0]+board[39]+board[38]+"  " + redBase[2]+redBase[3]);










        System.out.println(sb);
    }


}
