# Напишите программу, создающую список из чисел которые при делении на 5 дают в остатке 3. Отобразите список в прямом и обратном порядке.
# 1. вариант если пользователь вводит числа сам какие хочет

# list_nums = list(map(int, input("введите числа через пробел ").split()))
# print(list_nums)
# new_list = []
# # for i in list_nums:
# #     if i % 5 == 3:
# #         new_list.append(i)
# # print(new_list)
# # print(list(reversed(new_list)))

# 2. пеебора всех чисел от 1 до end,  где end это число, котором пользователь сказал остановиться

# end = int(input("До какого числа создавать список: "))
# list_number = []
# for i in range(1, end):
#    if i % 5 == 3:
#         list_number.append(i)

# print(list_number)
# print(list(reversed(list_number)))

# 3. пеебора всех чисел от 1 до end,  где end это число, котором пользователь сказал остановиться. по формуле 5k+3, где k = 0,1,2,3
end = int(input("Введите размер спика: "))
list_number = [5 * i + 3 for i in range(0, end)]
print(list_number)
print(list(reversed(list_number)))


