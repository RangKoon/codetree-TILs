arr = list(map(int, input().split()))
if arr[0] < arr[1] :
    print(arr[1] - arr[0])
if arr[0] > arr[1] :
    print(arr[0] - arr[1])
if arr[0] == arr[1] :
    print("0")