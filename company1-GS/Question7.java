public class Question7 {
    public static void main(String[] args) {
        System.out.println(findPosition(2,2,2));
    }
    static int findPosition(int N, int M, int K) {
        // code here
        int ans = (M - 1) % N + K;
        return (ans - 1) % N + 1;

    }
}