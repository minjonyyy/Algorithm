def solution(x, n):
    answer = []
    a=0
    for i in range(1,n+1):
        a += x
        answer.append(a)
    return answer