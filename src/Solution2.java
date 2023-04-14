

public class Solution2 {
    public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        int max = 0, count = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') count++;
            else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int N = 1041;
        System.out.println(solution2.solution(N));
    }
}
