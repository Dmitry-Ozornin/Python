// Необходимо разработать программу для сортировки массива целых чисел с использованием сортировки кучей (Heap Sort). Программа должна работать следующим образом:

// Принимать на вход массив целых чисел для сортировки. Если массив не предоставлен, программа использует массив по умолчанию.

// Сначала выводить исходный массив на экран.

// Затем применять сортировку кучей (Heap Sort) для сортировки элементов массива в порядке возрастания.

// Выводить отсортированный массив на экран.

// Ваше решение должно содержать два основных метода: buildTree, который строит сортирующее дерево на основе массива, и heapSort, который выполняет собственно сортировку кучей.

// Программа должна быть способной сортировать массив, даже если он состоит из отрицательных чисел и имеет дубликаты.

// На входе:


// '5 8 12 3 6 9'
// На выходе:


// Initial array:
// [5, 8, 12, 3, 6, 9]
// Sorted array:
// [3, 5, 6, 8, 9, 12]

import java.util.Arrays;

class HeapSort {
    public static void buildTree(int[] initArray, int n, int i) {
        // Введите свое решение ниже
        int left = i * 2 + 1  ; // левый дочерний элемент
        int right = i * 2 + 2; //правый дочерний элемент
        int large = i; // Наибольший элемент инциализация

        // если левый дочерний элемент больше корня
        if(left < n && initArray[left] > initArray[large]){
            large = left;
        }

        // если правый дочерний элемент больше корня
        if(right < n && initArray[right] > initArray[large]){
            large = right;
        }

        // если самый большой элемент не корень

        if( large != i){
            int t = initArray[i];
            initArray[i] = initArray[large];
            initArray[large] = t;
            buildTree(initArray, n, large);
        }
        

    }

    public static void heapSort(int[] initArray) {
        // Введите свое решение ниже
        int n = initArray.length ;
        // куча(групировка массива)
        for (int i = n / 2 - 1; i >= 0; i--){
            buildTree(initArray, n , i);
        }

        for (int i = n - 1; i >= 0; i--) {
            // перемещаем текущий корень в конец
            int t = initArray[i];
            initArray[i] = initArray[0];
            initArray[0] = t;
            buildTree(initArray, i, 0);
        }
    }
    
}

// Не удаляйте и не меняйте метод Main!
public class Heap {
    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            initArray = new int[] { 2, 10, 6, 19, 25, 13, 8, 4};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}