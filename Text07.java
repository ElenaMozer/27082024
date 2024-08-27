import java.util.Scanner;

public class Text07 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("введите годовой процент");
        double x = Scanner.nextDouble();
        System.out.println("введите величину вклада");
        double y = Scanner.nextDouble();


        System.out.println((x*0.01*y+y)*2);

    }
}
