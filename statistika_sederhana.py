a = int(input())

n = list(map(int, input().split()))
mx = n[0]
mn = n[0]

for i in n:
    if i>mx:
        mx=i
    if i<mn:
        mn=i
print(mx, mn)