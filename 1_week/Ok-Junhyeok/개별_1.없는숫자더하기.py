def solution(numbers):
  answer = 0
  # flag = 0
  for i in range(10):
    # 솔루션 1 깃발 이용하기
    for j in range(len(numbers)):
      if i == numbers[j]:
        flag = 1    
    if flag == 0:
      answer += i
    flag = 0
    # 솔루션 2 리스트 함수 이용하기
    if i not in numbers:
      answer += i
  return answer

print(solution([1,2,3,4,6,7,8,0]))
print(solution([5,8,4,0,6,7,9]))