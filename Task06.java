import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("введите высоту");
        int x = Scanner.nextInt();
        System.out.print("введите ширину");
        int y = Scanner.nextInt();


        System.out.println(x*y);
        System.out.println(2*(x+y));

    }
}
