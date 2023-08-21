hour, minute = map(int, input().split())
require_time = int(input())

# 입력한 현재 시간과 입력한 걸리는 시간을 다 더한후
# 시간은 60으로 나눈 몫 분은 60으로 나눈 나머지

time = hour * 60 + minute + require_time

if(time >= 1440):
    time = time - 1440

hour = time // 60
minute = time % 60

print("{} {}".format(hour,minute))