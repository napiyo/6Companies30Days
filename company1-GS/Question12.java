public class Question12 {
//    https://practice.geeksforgeeks.org/problems/squares-in-nn-chessboard1801
//    squares in nn chess
    public static void main(String[] args) {
        System.out.println(squaresInChessBoard(5L));
    }
    static Long squaresInChessBoard(Long N) {
        // code here
        return (N*(N+1)*(2*N+1))/6;
    }
}
