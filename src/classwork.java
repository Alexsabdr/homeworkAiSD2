import java.util.Stack;

public class classwork {
    public static boolean bracket(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if ((c == '(') || (c == '{') || c == ('[')) ;
            stack.push(c);
        }
        if (stack.isEmpty()) {
            return false;
        }

        for (char c : s.toCharArray()) {
            if (c == ')' && c != '(') {
                return false;
            }
            if (c == '}' && c != '{') {
                return false;
            }
            if (c == ']' && c != '[') {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.print(bracket("()"));
    }
}