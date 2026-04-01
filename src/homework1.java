package cw2703;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class homework1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] nums = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
            int target = scanner.nextInt();
            findPair(nums,target);
        }
        public static void findPair(int[] nums, int target) {
            Set<Integer> seen = new HashSet<>();
            Set<Integer> help = new HashSet<>();

            for (int num : nums) {
                int complement = target - num;
                if (seen.contains(complement)) {
                    int s = Math.min(num,complement);
                    System.out.println("Найдена пара: " + num + " + " + complement + " = " + target);

                    if(!help.contains(s)){
                        System.out.println(s + "+" + (target - s));
                        help.add(s);
                    }
                }
                seen.add(num);
            }
        }
    }

