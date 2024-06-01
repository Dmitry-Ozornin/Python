
import csv
from data_create import name_data, surname_data,phone_data,address_data, find_name_file


def input_data():
    name = name_data()
    surname = surname_data()
    phone = phone_data()
    address = address_data()
    with open('guide.csv', 'a+', encoding='utf-8', newline='') as f:
        fieldnames = ['Имя', 'Фамилия','Телефон','Адрес']
        input = csv.DictWriter(f, fieldnames=fieldnames)
        input.writerow({'Имя':name, 'Фамилия':surname, 'Телефон':phone, 'Адрес':address})

def print_data():
    print('СПРАВОЧНИК')
    with open('guide.csv', 'r', encoding="utf-8") as f:
        for line in f:
            print(line.strip())

def find_data():
    find_info: str | None = find_name_file()
    with open('guide.csv','r', encoding='utf-8', newline='') as guide:
        buffer = list(csv.DictReader(guide))
        for line in buffer:
            if find_info.casefold() in line['Имя'] or find_info.casefold() in line['Фамилия'] or find_info.casefold() in line['Телефон'] or find_info.casefold() in line['Адрес']:
                print(line)

def change_data():
        find_info: str | None = find_name_file()
        with open('guide.csv', encoding='utf-8', newline='') as guide:
            buffer = list(csv.DictReader(guide))
            for line in buffer:
                if find_info.casefold() in line['Имя'] or find_info.casefold() in line['Фамилия'] or find_info.casefold() in line['Телефон'] or find_info.casefold() in line['Адрес']:
                    print(line)
                    if input("Это значение? Да\Нет:\n") == "Да".casefold():
                        what = input("Введите значениеbp из контакта, которое хотите поменять: ")
                        if what.casefold() in line['Имя']:
                            line['Имя'] = input("Введите новое значение: ")

                        elif what.casefold() in line['Фамилия']:
                            line['Фамилия'] = input("Введите новое значение: ")

                        elif what.casefold() in line['Телефон']:
                            line['Телефон'] = input("Введите новое значение: ")

                        elif what.casefold() in line['Адрес']:
                            line['Адрес'] = input("Введите новое значение: ")

        with open('guide.csv', 'w', encoding='utf-8', newline='')as f:
            fieldnames = ['Имя', 'Фамилия','Телефон','Адрес']
            write = csv.DictWriter(f, fieldnames=fieldnames)
            write.writeheader()
            write.writerows(buffer)
                
               
def delete_contact():
    find_info: str | None = find_name_file()
    with open('guide.csv', encoding='utf-8', newline='') as guide:
        buffer = list(csv.DictReader(guide))
        for line in buffer:
            if find_info.casefold() in line['Имя'] or find_info.casefold() in line['Фамилия'] or find_info.casefold() in line['Телефон'] or find_info.casefold() in line['Адрес']:
                print(line)
                if input("Это значение? Да\Нет:\n") == "Да".casefold():
                    buffer.remove(line)
                       
    with open('guide.csv', 'w', encoding='utf-8', newline='')as f:
        fieldnames = ['Имя', 'Фамилия','Телефон','Адрес']
        write = csv.DictWriter(f, fieldnames=fieldnames)
        write.writeheader()
        write.writerows(buffer)

def transfer_info():
    info_need = int(input("Введите строку которую хотите перенести: ")) - 1
    with open('guide.csv', 'r+', encoding='utf-8', newline='') as guide:
        buffer = list(csv.DictReader(guide))
        i = 0
        while i < len(buffer):
            if i == info_need:
                info_need = buffer[i]

                print(buffer, end='')
                i += 1
            else:
                i += 1
    with open('guide.csv', 'w', encoding='utf-8', newline='') as f:
        fieldnames = ['Имя', 'Фамилия','Телефон','Адрес']
        write = csv.DictWriter(f, fieldnames=fieldnames)
        write.writeheader()
        write.writerows(buffer)
    with open('guide2.csv', 'a+', encoding='utf-8', newline='') as fd:
        fieldnames = ['Имя', 'Фамилия','Телефон','Адрес']
        writer = csv.DictWriter(fd, fieldnames=fieldnames)
        writer.writeheader()
        writer.writerow(info_need)