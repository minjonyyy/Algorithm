class Solution {
    public String solution(String s) {
        String answer = "";

        int count = 0;
        
        for(int i=0; i<s.length(); i++){
            String sub = s.substring(i,i+1);
            if(sub.equals(" ")){
                answer += " ";
                count=0;
            } else if(count%2 == 0){
                answer += sub.toUpperCase();
                count++;
            } else {
                answer += sub.toLowerCase();
                count++;
            }
        }
        
        return answer;
    }
}