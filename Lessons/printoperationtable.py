# Напишите функцию print_operation_table(operation, num_rows, num_columns), которая принимает в качестве аргумента функцию, вычисляющую элемент по номеру строки и столбца. По умолчанию номер столбца и строки = 9.

# Аргументы num_rows и num_columns указывают число строк и столбцов таблицы, которые должны быть распечатаны.

# Нумерация строк и столбцов идет с единицы (подумайте, почему не с нуля).

# Если строк меньше двух, выдайте текст
# ОШИБКА! Размерности таблицы должны быть больше 2!.

# Примечание: бинарной операцией называется любая операция, у которой ровно два аргумента, как, например, у операции умножения.

# Между элементами должен быть 1 пробел, в конце строки пробел не нужен.

# первый вариант
# def print_operation_table(operation, num_rows = 9 , num_columns = 9): 
#     if num_columns < 3:
#         print("ОШИБКА! Размерности таблицы должны быть больше 2!")
#     else:
#         for i in range(1, num_rows + 1):
#             for j in range(1, num_columns + 1):
#                 print(*list(map(operation, [i], [j])), end=' ')

# второй вариант
def print_operation_table(operation, num_rows = 9 , num_columns = 9): 
    if num_rows < 2:
        print("ОШИБКА! Размерности таблицы должны быть больше 2!")
        return
    for i in range(1, num_rows + 1):
        answer = []
        for j in range(1, num_columns + 1):
            answer.append(str(operation(i, j)))
        print(" ".join(answer))

                
print_operation_table(lambda x, y: x * y, 3, 3)