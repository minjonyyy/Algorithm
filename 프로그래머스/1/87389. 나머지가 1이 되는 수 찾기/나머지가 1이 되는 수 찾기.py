def solution(n):
    answer = 0 
    i = 1
    
    while(i <= n):
        if (n%i == 1):
            answer = i
            break
        i += 1
        
    return answer
    