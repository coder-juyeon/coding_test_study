n = int(input())
result = 0

# (a,b)a부터 b보다작을 때 까지
for i in range(1,n+1):
    result += i

print(result)