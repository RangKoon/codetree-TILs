arr = list(map(int , input().split()))
b = int((10000*arr[1]) / (arr[0]*arr[0]))
print(b)
if b>=25 :
    print("Obesity")