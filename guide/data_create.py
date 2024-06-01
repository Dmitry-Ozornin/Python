import csv
def name_data():
    name = input('Введите ваше имя: ')
    return name

def surname_data():
    surname = input('Введите вашу фамилию: ')
    return surname

def phone_data():
    phone = input('Введите ваш телефон: ')
    return phone

def address_data():
    address = input('Введите ваш адрес: ')
    return address

def find_name_file():
    with open('guide.csv', 'r', encoding='utf-8') as guide:
        find_file = input("Введите информацию, которую ищете в файле: ")
        for line in guide:
            if find_file.casefold() in line:
                return find_file
        else:
            print("В справочнике нет данного значения!")
            