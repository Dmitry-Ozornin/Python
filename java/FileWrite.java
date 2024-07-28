// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.

import java.io.FileWriter;
public class FileWrite {
    public static void main(String[] args) {
        String str = "TEST";
        int n = 100;
        String newStr = StringMaker(str, n);
        String fileName = "text.txt";
        writeTofile(newStr, fileName);

    }

    public static String StringMaker(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }

    public static void writeTofile(String str, String fileName) {
        try (FileWriter fw = new FileWriter(fileName)){

            fw.write(str);
        } catch (Exception e) {
            System.err.println("Error");
            // TODO: handle exception
        }
    }
    
}
