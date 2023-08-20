# 분은 60에 현재 분을 더한후 45를 뺌
# 시간은 더한 분이 60을 넘었을 때 1을 빼주기

hour, minute = map(int, input().split())

if(minute >= 45):
    minute = minute - 45
elif(minute < 45):
    sum_minute = 60 + minute
    minute = sum_minute - 45
    hour = 23 if hour == 0 else hour-1

# print("%d %d" %(hour, minute))
print("{} {}".format(hour,minute))