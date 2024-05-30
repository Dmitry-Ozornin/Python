
from io import TextIOWrapper
from data_create import name_data, surname_data,phone_data,address_data, find_name_file


def input_data():
    name = name_data()
    surname = surname_data()
    phone = phone_data()
    address = address_data()
    with open('guide.csv', 'a', encoding='utf-8') as f:
        f.write(f"\n{name};{surname};{phone};{address};\n")

def print_data():
    print('вывожу данные из второго файла: \n')
    with open('guide.csv', 'r', encoding="utf-8") as f:
        for line in f:
            print(line.strip())

def find_data():
    find_file = find_name_file()
    with open('guide.csv', 'r', encoding="utf-8") as f:
        for line in f:
            if find_file.casefold() in line:
                print(line)

def change_data():
    with open('buffer.csv', 'w', encoding='utf-8') as delete:
        find_info: str | None = find_name_file()
        with open('guide.csv','rt', encoding='utf-8') as guide:
            buffer = open('buffer.csv', 'a', encoding='utf-8')
            for line in guide:
                if find_info.casefold() in line:
                    print(line)
                    if input("Это значение? Да\Нет:\n") == "Да".casefold():
                        find_info2 = input("Введите точное значение, которое хотите изменит(ПРОВЕРЬТЕ ПЕРЕД ВВОДОМ):\n")
                        list = (line.strip()).split(';')
                        new_info = input("введите новое занчение:\n ")
                        i = 0
                        while i < len(list):
                            if find_info2.casefold() == list[i]:
                                list[i] = new_info
                                buffer.writelines(f'{list[i]};')
                                i += 1
                            else:
                                buffer.writelines(f'{list[i]};') 
                                i += 1
                    else:     
                        buffer.write(f'\n{line}')
                else:     
                    buffer.write(f'\n{line}') 
    
def record_data():
    with open('guide.csv', 'w', encoding='utf-8'):
        with open('buffer.csv', 'r', encoding='utf-8') as fm:
            record = open('guide.csv', 'a', encoding='utf-8')
            for line in fm:
                record.write(f'{line}')
                
               
# def delete_contact():
#     with open('buffer.csv', 'w', encoding='utf-8') as delete: