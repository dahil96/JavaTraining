package ChessGame;

public class TestGame {
    public static void main(String args[]) {
        Queen whiteQueen = new Queen(5,1);
        Position newPositionDiagonal = new Position(3,3);
        Position newPositionRow = new Position(4,1);
        Position newPositionColumn = new Position(1,4);

        if (whiteQueen.isValidMove(newPositionRow)) {
            System.out.println("Correct move");
        } else {
            System.out.println("Incorrect move");
        }
    }
}
