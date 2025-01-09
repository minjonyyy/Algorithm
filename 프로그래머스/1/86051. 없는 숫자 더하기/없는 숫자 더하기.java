import java.util.ArrayList;

class Solution {
    public int solution(int[] numbers) {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> b = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            boolean found = false;
            for (int num : numbers) {
                if (num == a[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                b.add(a[i]);
            }
        }

        int answer = 0;
        for (int num : b) {
            answer += num;
        }

        return answer;
    }
}
