package hw5;

import java.util.Stack;

public class StackEx {

    public static boolean isRightFigure(String text) {
        Stack<Character> stack = new Stack<>();
        for (char c : text.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.add(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char c1 = stack.pop();
                if ((c == ')' && c1 != '(') || (c == ']' && c1 != '[') || (c == '}' && c1 != '{')) {
                    return false; // Несоответствие открывающей и закрывающей скобок, последовательность неправильна
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String str1 = "([{}])";
        String str2 = "([)]";
        String str3 = "{()]";

        System.out.println(isRightFigure(str1));
        System.out.println(isRightFigure(str2));
        System.out.println(isRightFigure(str3));


    }
}
