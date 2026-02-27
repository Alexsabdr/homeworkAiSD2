public class homework_1 {
    public static int nod(int a, int b) {
        if ((a == 0) || (b == 0)) return 0;
        if (a > b) {
            while (b != 0) {
                int temp = a % b;
                a = b;
                b = temp;
            }
        } else {
            while (b != 0) {
                int h = b;
                b = a % b;
                a = h;
            }
        }
        return(a);
    }

    public static int nod2 (int a, int b){
        if (b != 0){
            while (b != 0){
                int temp = a % b;
                a = b;
                b = temp;
            }
            while (b != 0){
                int ost = b % (a % b);
                b = (a % b);
                a = b % ost;
            }
        }
        return(a);
    }

    public static void main(String[] args){
        int num1 = 7975;
        int num2 = 2585;
        System.out.print(nod(num1,num2));
        System.out.print(nod2(num1,num2));
    }
}