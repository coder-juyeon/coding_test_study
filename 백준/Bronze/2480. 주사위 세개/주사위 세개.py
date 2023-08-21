dice = []
count = 0
eye_count = [0] * 7
money = 0

dice += input().split()
dice = list(map(int, dice))
dice.sort()

for i in dice:
    eye_count[i] += 1
    

for i in range(len(eye_count)):
    if(eye_count[i] == 3):
        money = 10000 + i*1000
        break
    elif(eye_count[i] == 2):
        money = 1000 + i*100
        break
    else:
        money = dice[2] * 100

print(money)


