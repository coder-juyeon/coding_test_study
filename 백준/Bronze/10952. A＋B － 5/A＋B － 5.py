import sys

result = []
A,B = None, None

while(True):
    A,B = map(int, sys.stdin.readline().split())
    if(A == 0 and B == 0):
        break
    result.append(A+B)
    
for sum in result:
    print(sum)
