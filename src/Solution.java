import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] abc = {3, 1, 2, 4, 3};
        System.out.println(solution.solution(abc));
    }

    public int solution(int[] A) {
        int totalSum = 0;
        int path = Integer.MAX_VALUE;
        int tempPath;
        int first = 0;
        int second;

        for (int i : A) {
            totalSum += i;
        }

        for (int i = 1; i < A.length; i++) { // P = 0    x = 0;      suma = 13;
            first += A[i - 1];
            second = totalSum - first;
            tempPath = Math.abs(second - first);
            if (tempPath < path)
                path = tempPath;
        }
        return path;
    }
}
