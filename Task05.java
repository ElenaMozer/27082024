import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("введите радиус");
        float r = Scanner.nextFloat();
        System.out.println(3.141*r*r);
        System.out.println(3.141*2*r);
    }
}
