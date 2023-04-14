import java.util.ArrayList;
import java.util.List;


public class Solution1 {
    public int solution(int[] A) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            if (list.contains(A[i])) {
                list.remove(Integer.valueOf(A[i]));
            } else {
                list.add(A[i]);
            }
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(solution1.solution(A));
    }
}






