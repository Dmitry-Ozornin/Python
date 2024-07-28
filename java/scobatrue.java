// Задание №2 Написать программу, определяющую правильность расстановки скобок в выражении. 
// Пример 1: a+(d*3) - истина 
// Пример 2: [a+(1*3) - ложь 
// Пример 3: [6+(3*3)] - истина 
// Пример 4: {a}[+]{(d*3)} - истина 
// Пример 5: <{a}+{(d*3)}> - истина 
// Пример 6: {a+]}{(d*3)} - ложь

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class scobatrue {
    public static void main(String[] args) {
        String[] strings = {"a+(d*3)", "[a+(1*3)", "[6+(3*3)]", "{a}[+]{(d*3)}", "<{a}+{(d*3)}>", "{a+]}{(d*3)}" };
        for (String str : strings) {
            boolean isCorrect = isBracketsCorrect(str);
            System.out.println(str + " ->" + isCorrect);
            

            
        }


    }

    public static Map<Character,Character> getBracketsMap(){
        Map<Character, Character> brakets = new HashMap<>();
        brakets.put(')', '(');
        brakets.put(']', '[');
        brakets.put('}', '{');
        brakets.put('>', '<');
        return brakets;
    }

    public static boolean isBracketsCorrect( String expression){
        Map<Character, Character> brackets = getBracketsMap();
        Stack<Character> stack = new Stack<>();
        for (Character c : expression.toCharArray()) {
            if(brackets.containsValue(c)){
                stack.push(c);
            } else if(brackets.containsKey(c)){
                if(stack.isEmpty() || stack.pop() != brackets.get(c)){
                    return false;
                }
            }
            
        }
        return stack.isEmpty();
    }
}
