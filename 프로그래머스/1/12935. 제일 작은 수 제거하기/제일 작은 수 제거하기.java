import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 0) {
            return new int[]{-1};
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) { 
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        ArrayList<Integer> answerList = new ArrayList<>();
        for (int num : arr) {
            if (num != min) {
                answerList.add(num);
            }
        }

        if (answerList.isEmpty()) {
            return new int[]{-1};
        }

 
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
