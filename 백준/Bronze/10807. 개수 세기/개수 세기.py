import sys

N = int(sys.stdin.readline())

number = list(map(int, sys.stdin.readline().split()))
find_number = int(sys.stdin.readline())

count = number.count(find_number)

print(count)