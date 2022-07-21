import java.util.Scanner;
public class Power {
    static int power(int a , int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner işl= new Scanner(System.in);
        int a,b;

        System.out.println("First Number: ");
        a= işl.nextInt();
        System.out.println("Second Number: ");
        b= işl.nextInt();

        System.out.println(power(a,b));
    }
}
