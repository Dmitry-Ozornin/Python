// Реализуйте метод, который принимает на вход целочисленный массив arr:
// - Создаёт список ArrayList, заполненный числами из исходого массива arr.
// - Сортирует список по возрастанию и выводит на экран.
// - Находит минимальное значение в списке и выводит на экран - Minimum is {число} - Находит максимальное значение в списке и выводит на экран - Maximum is {число}
// - Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
// Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:

// Integer[] arr - массив целых чисел.

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Answer {
    public ArrayList<Integer> analyzeNumbers(Integer[] arr) {
      // Введите свое решение ниже
      ArrayList<Integer> array = new ArrayList<>();
      
      for (int i = 0; i < arr.length; i++) {
        array.add(arr[i]);
      }
      
      return array;

       
    }

    public static int minArray(Integer[] arr) {
      int min = arr[0];
      for (int i = 0; i < arr.length; i++) {
        if(min > arr[i]){
          min = arr[i];
        }
        
      }
      return min;



      
    }
    public static int maxArray(Integer[] arr) {
      int max = arr[0];
      for (int i = 0; i < arr.length; i++) {
        if(max < arr[i]){
          max = arr[i];
        }
        
      }
      return max;



      
    }

    public static double Averge(Integer[] arr) {
      double sum = 0;
      double averge = 0;
      for (int i = 0; i < arr.length; i++) {
        sum = sum + arr[i];
        }
      averge = sum / arr.length;
      
      return averge;



    
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class MinMaxArray{ 
    public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      Answer ans = new Answer();      
      ArrayList<Integer> nums = ans.analyzeNumbers(arr);
      Collections.sort(nums);
      System.out.println(nums);
      int min = ans.minArray(arr);
      System.out.println("Minimum is " + min);
      int max = ans.maxArray(arr);
      System.out.println("Maximum is " + max);
      double averge = ans.Averge(arr);
      System.out.println("Average is " + averge);

    }
}