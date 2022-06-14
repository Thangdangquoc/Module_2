import java.util.Scanner;

public class giaiThua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so tinh giai thua: ");
        int number = input.nextInt();
        System.out.println("Giai thua: ");
        System.out.println(giaiThua(number));

    }
    public static double giaiThua(int a){
        int sum = 1;
        for (int i = 2; i <= a; i++) {
       sum = sum *i;
        }
        return sum;
    }
}
