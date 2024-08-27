import java.util.Scanner;

public class Text11 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("введите количество секунд до нового года");
        long x = Scanner.nextLong();
        System.out.println(x/86400);  System.out.println(x/3600); System.out.println(x/60);

    }
}
