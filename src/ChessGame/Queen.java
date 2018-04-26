package ChessGame;

public class Queen extends Piece {
    public Queen(int column, int row) {
        super(column, row);
    }
    public boolean isValidMove(Position newPosition){
        boolean result = true;
        //Move is maid inside of the board
        result = result && super.isValidMove(newPosition);

        //Check if move is a vaid diagonal or row/column move
        boolean OkdiagonalOrRowColumnMove = false;
        OkdiagonalOrRowColumnMove = super.isValidDiagonalMove(newPosition) || super.isValidRowColumnMove(newPosition);
        result = result && OkdiagonalOrRowColumnMove;
        return result;
    }
}
