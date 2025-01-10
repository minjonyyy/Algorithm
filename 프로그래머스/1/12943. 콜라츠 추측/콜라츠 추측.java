class Solution {
    public int solution(long num) {
        int repeat = 0;
        
        if (num==1){
            return 0;
        }
        
        while (num != 1){
            if(repeat>=500){
                return -1;
            }
            if(num%2==0){
                num /= 2;
                    
            } else{
                num = num*3 + 1;         
            }
            repeat++;    
        }
         
        return repeat;
    }
}
