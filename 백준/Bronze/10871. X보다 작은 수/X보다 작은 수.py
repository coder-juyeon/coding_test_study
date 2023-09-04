from sys import stdin

input = stdin.readline

N,X = map(int, input().split())
numbers = list(map(int, input().split()))

for num in numbers:
    if(num < X):
        print(num, end=" ")