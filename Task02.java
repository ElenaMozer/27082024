import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("введите число");
        short n = Scanner.nextShort();

        int part1  = n/100;
        int part2  = n%100/10;
        int part3  = n%10;

        System.out.println(part1);
        System.out.println(part2);
        System.out.println(part3);
        System.out.println(part1+part2+part3);
    }
}
