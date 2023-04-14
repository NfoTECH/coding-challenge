import java.util.Arrays;

public class Solution3 {
    public int[] solution(int[] A) {
        int[] result = new int[A.length];
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (isPrime(A[i])) {
                result[count] = A[i];
                count++;
            }
        }
        return Arrays.copyOf(result, count);
    }

    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        int[] A = {3, 67, 12, 7, 11, 9};
        System.out.println(Arrays.toString(solution3.solution(A)));
    }
}
