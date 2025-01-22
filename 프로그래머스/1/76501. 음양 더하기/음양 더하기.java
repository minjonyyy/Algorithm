class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        int[] realNum = new int[absolutes.length];
        
        for(int i=0; i<absolutes.length; i++){
            if(signs[i]==false){
                realNum[i]=0-absolutes[i];
            } else {
                realNum[i]=absolutes[i];
            }
        }
        
        for (int i=0; i<realNum.length; i++){
            answer += realNum[i];
        }
        return answer;
    }
}