// Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
public class palindrome {
    public static void main(String[] args) {
        String str = "ABA";
        System.out.println(isPalindrome(str));

    }

    static boolean isPalindrome(String str) {

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)){
                return false;
            }
        }
        return true;

    }

}
