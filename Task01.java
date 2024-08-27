import java.sql.SQLOutput;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("введите натуральное число 1");
        int x = Scanner.nextInt();
        System.out.print("введите натуральное число 2");
        int y = Scanner.nextInt();


        System.out.println(x/y);
        System.out.println(x%y);

        double result=Math. sqrt (x);
        System. out. println (result);

    }
}
