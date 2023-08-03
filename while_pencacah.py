sum = 0

while True:
    try:
        a = int(input())
        sum+=a
    except EOFError:
        break
print(sum)
    