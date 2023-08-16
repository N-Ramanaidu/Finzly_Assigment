import java.util.Scanner;
public class KnightMoves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row : ");
        int row = sc.nextInt();
        System.out.print("Enter the column : ");
        int col = sc.nextInt();
        int numberOfMoves = getPossibleKnightMoves(row, col);
        System.out.println("The Hourse at position (" + row + ", " + col + ") can have " +
                           numberOfMoves + " possible moves.");
    }
    public static int getPossibleKnightMoves(int row, int col) {
        int[][] knightMoves = {
            {-2, -1}, {-2, 1},
            {-1, -2}, {-1, 2},
            {1, -2}, {1, 2},
            {2, -1}, {2, 1}
        };
        int possibleMoves = 0;
        for (int[] move : knightMoves) {
            int newRow = row + move[0];
            int newCol = col + move[1];
            if (isValidMove(newRow, newCol)) {
                possibleMoves++;
            }
        }
        return possibleMoves;
    }
    public static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 8 && col >= 0 && col < 8;
    }
}