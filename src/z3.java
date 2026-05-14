package cw0805;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class z3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = sc.nextLine();

        if (input.isEmpty()) return;

        List<Integer> fib = new ArrayList<>();
        fib.add(0);
        fib.add(1);

        int len = input.length();
        int nextFib = 1;
        int i = 2;

        while (true) {
            nextFib = fib.get(i - 1) + fib.get(i - 2);
            if (nextFib >= len) break;
            fib.add(nextFib);
            i++;
        }

        String result = "";
        int lastIndex = -1;

        for (int index : fib) {
            if (index < len && index != lastIndex) {
                result = result + input.charAt(index);
                lastIndex = index;
            }
        }

        System.out.println("Результат: " + result);
    }
}
