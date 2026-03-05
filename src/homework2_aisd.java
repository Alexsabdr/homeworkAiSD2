import java.util.Objects;
import java.util.Stack;

public class homework2_aisd {
    public static double calculation(Object[] result) {
        Stack<Double> stack = new Stack<>();
        for (Object result : result) {
            if (result instanceof Double) {
                stack.push((Double) result);
            } else {
                double res1 = stack.pop();
                double res2 = stack.pop();


                switch ((String) result) {
                    case "+":
                        stack.push(res1 + res2);
                    case "*":
                        stack.push(res1 * res2);
                }
            }
        }
        return stack.pop();
    }
}

