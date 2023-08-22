case_number = int(input())
result = []
for i in range(case_number):
    A, B = map(int, input().split())
    result.append(A+B)


for i in range(0, case_number):
    print(result[i])