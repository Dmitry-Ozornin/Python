Нахождение второго максимального в списке
list_nums = list(map(int, input("введите числа через пробел ").split()))
list_nums.remove(max(list_nums))
print(max(list_nums))