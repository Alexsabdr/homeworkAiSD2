package cw1303;

public class Z2 {
    public static void main(String[] args) {



    }
    public static int BS(int[] arr, int n){
        int l = 0;
        int r = arr.length - 1;
        while (l <= r){
            int mid = l + (r - l)/ 2;
            if (arr[mid] <= n){
                l = mid + 1;
            }
        }
    }
}





