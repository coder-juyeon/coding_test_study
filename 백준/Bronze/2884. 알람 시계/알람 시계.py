# 입력받은 분과 시간을 합쳐 분으로 만들어주기
# 거기서 45을 빼고
# 60으로 나눈 몫은 시간 나머지값은 분으로 해주기

hour, minute = map(int, input().split())

time= minute + hour * 60
early_time = time - 45

if(early_time < 0):
    time = minute + 24 * 60
    early_time = time - 45

hour = early_time // 60
minute = early_time % 60


print("{} {}".format(hour, minute))