i = int(input())

pembagi = 1

while pembagi<=i:
    if i % pembagi ==0:
        print(int(i/pembagi))
    pembagi+=1