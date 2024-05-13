list_n = list(map(int, input("ведите числа через пробел ").split()))
i = 0
while i < len(list_n):
    if list_n[i] %2 == 0:
        list_n.remove(list_n[i])
        i += 1
    else:
        i += 1
print(sum(list_n))

