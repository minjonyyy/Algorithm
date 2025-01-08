class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int a = x / 10000 + (x/1000)%10 + (x/100)%10 + (x/10)%10 + x%10;
        
        if (x%a == 0){
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}
