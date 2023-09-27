def solution(price, money, count):
  answer = 0
  for i in range(1, count+1):
    answer += i*price
  answer = answer - money
  if answer < 0:
    answer = 0
  return answer

print(solution(3, 20, 4))