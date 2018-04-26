package ChessGame;

public class Piece {
    private Position position;

    public Piece(int column, int row) {
         position = new Position(column,row);
    }

    protected boolean isValidMove(Position newPosition){
        if(newPosition.row>0 && newPosition.column>0
                && newPosition.row<8 && newPosition.column<8){
            return true;
        }
        else {
            return false;
        }
    }

    protected boolean isValidDiagonalMove(Position newPosition){
        if (Math.abs(newPosition.column - this.position.column)
                == Math.abs(newPosition.row - this.position.row)) {
            return true;
        }
        else {
            return false;
        }
    }

    protected boolean isValidRowColumnMove(Position newPosition) {
        if (newPosition.column == this.position.column ||
                newPosition.row == this.position.row) {
            return true;
        }
        else {
            return false;
        }
    }

    public void movePiece (Position newPosition) {
        newPosition.column = this.position.column;
        newPosition.row = this.position.row;
    }
}
