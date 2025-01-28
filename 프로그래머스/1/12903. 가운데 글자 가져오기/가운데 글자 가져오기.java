class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        
        if (length % 2 == 1) {
            int midIndex = length / 2;
            answer = String.valueOf(s.charAt(midIndex));
        } 
        
        else {
            int midIndex1 = length / 2 - 1;
            int midIndex2 = length / 2;
            answer = s.substring(midIndex1, midIndex2 + 1);
        }
        
        return answer;

    }
}