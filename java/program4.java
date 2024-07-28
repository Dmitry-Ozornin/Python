// Задание №4 Реализовать стэк с помощью массива. Нужно реализовать методы: size(), empty(), push(), peek(), pop(). 
public class program4 {
    private static int[]stackArray;
    private static int capacity;
    private static int topindex;
    public static void main(String[] args) {
        capacity = 5;
        stackArray = new int[capacity];
        topindex = -1;
        System.out.println(size());
        System.out.println(empty());
        push(1);
        push(33);
        push(353);
        push(535);
        push(45435);
        System.out.println(size());
        System.out.println(empty());
        System.out.println(peek());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(size());
    }

    public static int size() {
        return topindex + 1;
        
    }

    public static boolean empty() {
        return topindex == -1;
    }

    public static void push(int num) {
        stackArray[++topindex] = num;
        // topindex++; указывается, если ранее в скобках квадратных не указали ++ в начале.
    }

    public static int peek() {
        return stackArray[topindex];
        
    }

    public static int pop() {
        return stackArray[topindex--];
    }
}
