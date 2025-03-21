class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
 
            if (ch >= 'a' && ch <= 'z') { 
                char shifted = (char) ((ch - 'a' + n) % 26 + 'a');
                answer += shifted;
            } else if (ch >= 'A' && ch <= 'Z') { 
                char shifted = (char) ((ch - 'A' + n) % 26 + 'A');
                answer += shifted;
            } else { 
                answer += ' ';
            }
            
        }
        return answer;
    }
}