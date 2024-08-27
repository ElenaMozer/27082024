import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("введите число");

        float x = Scanner.nextFloat();

        boolean part1 = x == x-x%1;

        System.out.println(part1);
    }
}
