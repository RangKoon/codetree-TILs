arr = list(map(int, input().split()))
a,b = arr[0],arr[1]
max = a if a>b else b
print(max)