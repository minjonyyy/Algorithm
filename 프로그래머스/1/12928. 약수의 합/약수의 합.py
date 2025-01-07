def solution(n):
    List = []
    
    for i in range(1,n+1):
        if (n%i == 0):
            List.append(i)
    
    return sum(List)