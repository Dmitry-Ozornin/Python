// Дано четное число N (>0) и символы c1 и c2. 📌 Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
public class AlternetingChars {
    public static void main(String[] args) {
        int n = 8;
        char c1 = 'A';
        char c2 = 'B';
        System.out.println(AlternetingCharsStr(n, c1, c2));
        System.out.println(AlternetingCharsSb(n, c1, c2));

        
    }
    
     public static String AlternetingCharsSb(int n, char c1, char c2) {
        // стрингбилдер, использовать при больщом объеме информации
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n / 2; i++) {
            sb.append(c1).append(c2);
            
        }
        return sb.toString();
     }

     public static String AlternetingCharsStr(int n, char c1, char c2) {
        // через строки, медленно и ресурсозатратно
        String str = "";
        for (int i = 0; i < n / 2; i++) {
            str = str + c1 + c2;
            
        }
        return str;
        
     }
    
}
