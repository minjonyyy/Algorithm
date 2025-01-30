class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char firstNum = my_string.charAt(num1);
        char secondNum = my_string.charAt(num2);
        
        
        for (int i=0; i<my_string.length(); i++){
            if(i == num1){
                answer += secondNum;
            } else if (i==num2){
                answer += firstNum;
            } else {
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}