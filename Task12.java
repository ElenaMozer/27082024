import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("введите количество учеников");
        float x = Scanner.nextFloat();
        double moloko = x*0.2;
        double moloko2 = moloko-moloko%1;
        double pirog = x*2;
        System.out.println(moloko2);
        System.out.println(pirog);

        double moloko60 = 0.6*x*0.2;
        double moloko602 = moloko60-moloko60%1;
        double pirog60 = 0.6*x*2;
        System.out.println(moloko602);
        System.out.println(pirog60);

        double moloko10 = 0.1*x*0.2;
        double moloko102 = moloko10-moloko10%1;
        double pirog10 = 0.1*x*2;
        System.out.println(moloko102);
        System.out.println(pirog10);
    }
    }

