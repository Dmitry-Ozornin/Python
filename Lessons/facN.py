# Факториал числа

n = int(input("Введите чсило, факториал которого хотите узнать: "))
if n < 0:
    print ("факториал не может быть вычеслен для отрицательного числа")
else:
    for i in range(1, n):
        n = n * i
    print(n)     

       
