package cw0805;

import java.util.ArrayList;
import java.util.List;

    public class cw0805 {

        public static boolean Fibonacci(int n) {
            if (n < 0) return false;
            if (n == 0 || n == 1) return true;
            List<Integer> fib = new ArrayList<>();
            fib.add(0);
            fib.add(1);

            int lastFib = 1;
            int i = 2;

            while (lastFib < n) {
                lastFib = fib.get(i - 1) + fib.get(i - 2);
                fib.add(lastFib);
                i++;
            }
            return lastFib == n;
        }

        public static void main(String[] args) {
            int number = 34;

            if (Fibonacci(number)) {
                System.out.println(number + " YES");
            } else {
                System.out.println(number + " NO");
            }
        }
    }







































































































