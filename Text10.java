import java.util.Scanner;

public class Text10 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("введите ваш рост");
        int x = Scanner.nextInt();
        System.out.print("введите ваш вес");
        int y = Scanner.nextInt();


        System.out.println(-(y-(x-110)));

    }
}
