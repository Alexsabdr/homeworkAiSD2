package cw1303;

public class Z1 {
    public static void main(String[] args){
        int[] arr = new int[]{1, 2, 3, 4, 4, 4};
        BS(arr, 4);
    }

    public static int BS(int[] arr, int n) {
        int imin = 0;
        int currentn = 0;
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == n){
                imin = mid;
                currentn++;
                System.out.println(mid);
            }
            if (arr[mid] <= n) {
                l = mid + 1;
            }
            if (arr[mid] >= n) {
                r = mid - 1;
            }
            return -1;
        }
        if(currentn >= 1){
            System.out.println(imin);
        }
        return n;
    }
}



