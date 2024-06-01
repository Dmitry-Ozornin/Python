from logger import input_data, print_data, find_data, change_data, delete_contact,transfer_info

def interface():
    print("Добрый день! Вы попали на специальный бот справочник от GeekBreans! \n 1 - запись данных \n 2 - вывод данных \n 3 - изменить данные \n 4 - удалить данные\n 5 - поиск данных\n 6 - перенести строку в новый файл")
    command = int(input('Введите число: '))

    while command != 1 and command != 2 and command != 3 and command != 4 and command != 5 and command != 6:
        print("Неправильный ввод")
        command = int(input('введите число '))

    if command == 1:
        input_data()
        print("Данные внесены!")    
    elif command == 2:
        print_data()
    elif command == 3:
        change_data()
        print("Данные изменены!")
    elif command == 4:
        delete_contact()
        print("Контакт удален!")
    elif command == 5:
        find_data()
        print("Поиск завершен!")
    else:
        if command == 6:
            transfer_info()
            print("УСпешно")

