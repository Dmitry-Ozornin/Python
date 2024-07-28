// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java. Создать множество ноутбуков. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию: 1 - ОЗУ 2 - Объем ЖД 3 - Операционная система 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.


import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
   
public class NotebookMain {
    public static void main(String[] args) {
        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(new Notebook("Lenovo", 512, 32, "MacOS",  "Black"));
        notebooks.add(new Notebook("Lenovo", 1024, 16, "Windows",  "Black"));
        notebooks.add(new Notebook("Lenovo", 512, 32, "Windows",  "White"));
        notebooks.add(new Notebook("Lenovo", 1024, 16, "Windows",  "Black"));
        notebooks.add(new Notebook("Asus", 512, 16, "MacOS",  "Red"));
        notebooks.add(new Notebook("Acer",512, 16, "Windows",  "White"));
        notebooks.add(new Notebook("Lenovo", 1024, 32, "Windows",  "Black"));
        notebooks.add(new Notebook("Samsung", 512, 16, "Windows",  "Black"));
        notebooks.add(new Notebook("Hair", 1024, 32, "Windows", "Black"));
        notebooks.add(new Notebook("Lenovo", 512, 32, "Windows",  "Black"));
        notebooks.add(new Notebook("Lenovo", 512, 16, "Windows",  "Black"));
        notebooks.add(new Notebook("Lenovo", 512, 32, "Windows",  "Black"));

        Map<Integer, String> criteria = new HashMap<>();
        
        criteria.put(1, "hdd");
        criteria.put(2, "ram");
        criteria.put(3, "os");
        criteria.put(4, "color");
        

        Scanner scanner = new Scanner(System.in);
        Map<String, String> filter = new HashMap<>();

        while(true){
            try{
                if(!filter.isEmpty()){
                    System.out.println("Критерии выбраны: ");
                    for (Map.Entry<String,String> entry : filter.entrySet()){
                        System.out.println(entry.getKey() + ":" + entry.getValue());
                    }
                }
            

                System.out.println("Введите число, согласно кретерию подбора: ");
                System.out.println("1 - Объем жесткого диска(512 или 1024)" + System.lineSeparator() + "2 - Объем оперативной памяти(16 или 32)" + System.lineSeparator() + "3 - операционная система(Windows или MackOS)" + System.lineSeparator() +  "4 - Цвет(Black или White) " + System.lineSeparator() );
            

                int criterion = scanner.nextInt();
                scanner.nextLine();
               

                if (criteria.containsKey(criterion)) {
                    String criterioString = criteria.get(criterion);
                    System.out.println("Введите значение криетрия " + criterioString);
                    String val = scanner.nextLine();
                    filter.put(criterioString, val);
                } else {
                    System.out.println("Неправильный критерий. Введите еще раз.");
                }

                System.out.println("Хотите пиодолжить ввод?(да, нет)");
                String contin = scanner.nextLine();
                if (!contin.equalsIgnoreCase("да")) {
                    break;
                }


            } catch (InputMismatchException e) {
                System.out.println("Введено неверно. Попробуйте еще раз");
                scanner.nextLine();

            }
        }
        scanner.close();

        Set<Notebook> filteredNotebooks = filNotebooks(new HashSet<>(notebooks), filter);
        if (filteredNotebooks.isEmpty()){
            System.out.println("Нет ноутбуков, подходящих под криетрии отбора");
        } else {
            System.out.println("Ноутбуки, подходящие под критерии:");
            for (Notebook notebook : filteredNotebooks ){
                System.out.println(notebook);
            
            }
            
        }

    }        




   public static Set<Notebook> filNotebooks(Set<Notebook> notebooks, Map<String, String> filter){
    Set<Notebook> filNotebooks = new HashSet<>(notebooks);
    for(Map.Entry<String, String> filEntry : filter.entrySet()) {
        String keyString = filEntry.getKey();
        String valString = filEntry.getValue();

        switch (keyString) {
            case "hdd":
                int hdd = Integer.parseInt(valString);
                filNotebooks.removeIf(notebook -> notebook.getHdd() != hdd);
                break;
            case "ram":
                int ram = Integer.parseInt(valString);
                filNotebooks.removeIf(notebook -> notebook.getRam() != ram);
                break;     
            case "os":
                
                filNotebooks.removeIf(notebook -> !notebook.getOS().equalsIgnoreCase(valString));
                break;
          
            case "color":
                filNotebooks.removeIf(notebook -> !notebook.getColor().equalsIgnoreCase(valString));
                break;
                       
        }

    }
    return filNotebooks;
    
   }
}  


