degree = float(input("введите сепень, в которое хотите возвети число " ))
num = float(input("введите число для возведения " ))
res = 1
if degree == 0:
    print(res)
else:
    i = 0
    while i < degree:
        res = res * num
        i += 1
    print(res)
