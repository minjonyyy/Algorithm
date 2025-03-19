import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]); //맨 처음 값은 그냥 넣기
        
        for(int arrs : arr){
            if(stack.peek()!=arrs){ //스택의 가장 마지막 값이 arrs랑 다를 때에만 push
                stack.push(arrs);
            }
        }
        
        int[] answer = new int[stack.size()];

        for(int i=answer.length-1; i>=0; i--){
            answer[i] = stack.pop();
        }
        
        return answer;
    }
}