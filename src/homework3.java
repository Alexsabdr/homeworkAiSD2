package cw2703;
import java.util.Scanner;

public class homework3{
    Scanner scanner = new Scanner(System.in);

    void main(){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        sorttt(arr);
    }

    public void sorttt(int[] arr){
        int target = scanner.nextInt();
        int l = 0;
        int r = arr.length - 1;

        while(l < r){
            int current = arr[l] + arr[r];
            if(current == target){
                System.out.println(arr[l] + "," + arr[r]);
                l++;
                r--;
            }
            else if (current < target){
                l++;
            }
            else if(current > target){
                r--;
            }
        }
    }
}
