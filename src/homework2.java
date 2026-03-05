import java.util.*;
public class homework2 {
        public static void main(String[] args) {
            Queue<Integer> q1 = new LinkedList<>(Arrays.asList(1, 4, 7));
            Queue<Integer> q2 = new LinkedList<>(Arrays.asList(2, 5, 8));
            Stack<Integer> stack = new Stack<>();
            Queue<Integer> result = new LinkedList<>();


            while (!q1.isEmpty() || !q2.isEmpty()) {
                if (q1.isEmpty()) stack.push(q2.poll());
                else if (q2.isEmpty()) stack.push(q1.poll());
                else {
                    if (q1.peek() <= q2.peek()) stack.push(q1.poll());
                    else stack.push(q2.poll());
                }
            }
            Stack<Integer> reverseStack = new Stack<>();
            while (!stack.isEmpty()) {
                reverseStack.push(stack.pop());
            }

            while (!reverseStack.isEmpty()) {
                result.add(reverseStack.pop());
            }
            System.out.println("Sorted Queue: " + result);
        }
    }

