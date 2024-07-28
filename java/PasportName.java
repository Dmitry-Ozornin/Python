// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации. 123456 Иванов 321456 Васильев 234561 Петрова 234432 Иванов 654321 Петрова 345678 Иванов Вывести данные по сотрудникам с фамилией Иванов.

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class PasportName {
    public static void main(String[] args) {
        // Map<Integer, String> hashMap = new HashMap<>();
        // Map<Integer, String> hashMap = new LinkedHashMap<>();
        Map<Integer, String> hashMap = new TreeMap<>(); 
        hashMap.put(123456, "Иванов");
        hashMap.put(321456, "Васильев");
        hashMap.put(234561, "Петров");
        hashMap.put(234432, "Иванов");
        hashMap.put(654321, "Петров");
        hashMap.put(345678, "Иванов");

        String targetName = "Иванов";

        for (int pasportNum: hashMap.keySet() ) {
            String name = hashMap.get(pasportNum);
            // if(name.equals(targetName)){
                System.out.println("Номер паспорта: " + pasportNum + ", фамилия сотрудника: " + name);
            // }
            
        }
    }
}
