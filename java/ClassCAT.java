// Задание №2 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является 
// а) информационной системой ветеринарной клиники 
// б) архивом выставки котов 
// в) информационной системой Театра кошек Ю. Д. Куклачёва Можно записать в текстовом виде, не обязательно реализовывать в java.

// A  Ветеренарная клиника
// Поля:
// Кличка(name)
// год рождения(birth year)
// Порода (breed)
// Номер паспорта (passport id)
// Окрас (color)
// Владелец (Owner)
// Пол (sex)
// Прививки (vactination)
// История посещений (visit history)

// Методы:
// Геторы : getname(), getbreed(), getcolor()...
// Сетеры: setname(), setbreed, setcolot()...
// Добавить прививку addVactination()
// Добавить посещение addVisit()
// ...

// Б    Выставка котов.

// Поля:
// Кличка(name)
// год рождения(birth year)
// Порода (breed)
// Номер паспорта (passport id)
// Окрас (color)
// Владелец (Owner)
// Пол (sex)
// Награды (awards)

// Методы:
// Геторы : getname(), getbreed(), getcolor()...
// Сетеры: setname(), setbreed, setcolot()...
// Добавить награду addAwards()
// Добавить посещение addVisit()
// ...

// B  информационной системой Театра кошек Ю. Д. Куклачёва
// Поля:
// Кличка(name)
// год рождения(birth year)
// Порода (breed)
// Номер паспорта (passport id)
// Окрас (color)
// Дрессировщик (Trainer)
// Навык (skills)
// Привики (vactinations)
// Роли (roles)
// Любимые лакомста( delicates)

// Методы:
// Геторы : getname(), getbreed(), getcolor()...
// Сетеры: setname(), setbreed, setcolot()...
// Добавить роль addRole()
// Добавить навыки addSkill()
// Добавить Лакомство addDelicates()

// Задание №3 
// 1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно использовать не все придуманные поля и методы. Создайте несколько экземпляров этого класса, выведите их в консоль. 
// 2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка, цвет и возраст (или другие параметры на ваше усмотрение).

import java.util.Objects;

public class ClassCAT {
    // Кличка(name)
// год рождения(birth year)
// Порода (breed)
// Номер паспорта (passport id)
// Окрас (color)
// Владелец (Owner)
// Пол (sex)
// Прививки (vactination)
// История посещений (visit history)
private String name;
private int birthYear;
private String color;
private String owner;

public ClassCAT (String name, int birthYear, String color,String owner ){
    this.name = name;
    this.birthYear = birthYear;
    this.color = color;
    this.owner = owner;

}
public String getName(){
    return name;
}
public int birthYear(){
    return birthYear;
}
public String color(){
    return color;
}
public String owner(){
    return owner;
}

public void setName(String name){
    this.name = name;
}
public void setbirthYear(int birthYear){
    this.birthYear = birthYear;
}
public void setcolor(String color){
    this.color = color;
}
public void setOwner(String owner){
    this.owner = owner;
}

@Override
public String toString() {
    // TODO Auto-generated method stub
    String result = "Кличка: " + name + System.lineSeparator() + "Год рождения: " + birthYear + System.lineSeparator() + "Окрас: " + color + System.lineSeparator() + "Хозяин: " + owner;
    return result;
}

@Override
public boolean equals(Object obj) {
    if( this == obj){
        return true;
    }
    
    // проверка на инцициализацию(объявление)
    if(obj == null || getClass() != obj.getClass()){
        return false;
    }

    ClassCAT cat = (ClassCAT) obj;

    return name.equals(cat.name) && birthYear == cat.birthYear && color.equals(cat.color) && owner.equals(cat.owner);
}

//вывод только уникальных котиков
@Override 
public int hashCode() { 
    // TODO Auto-generated method stub
    return Objects.hash(name, birthYear, color, owner);
}

}
