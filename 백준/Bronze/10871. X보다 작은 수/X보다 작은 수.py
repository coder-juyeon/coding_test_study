from sys import stdin

input = stdin.readline

N,X = map(int, input().split())
numbers = list(map(int, input().split()))
results = []
st = ""

for num in numbers:
    if(num < X):
        results.append(num)

for i in range(len(results)):
    st += str(results[i]) + " "

print(st)