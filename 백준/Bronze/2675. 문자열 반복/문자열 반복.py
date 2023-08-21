case_number = int(input())
result = []

for i in range(case_number):
    repeat_number, string = map(str, input().split())
    result.append("")
    for char in string:
        result[i] += char*int(repeat_number)

for i in range(len(result)):
    print(result[i])