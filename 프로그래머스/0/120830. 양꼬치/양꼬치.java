class Solution {
    public int solution(int n, int k) {
        int total = 0;
        int s = 0;
        
        if ( n >= 10 ){
            s = n /10;
        }
        
        total = n*12000 + k * 2000 - s * 2000;
    
        
        return total;
    }
}