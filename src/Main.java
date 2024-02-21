
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r;
        double alpha ;
        double pi =  3.14;



        Scanner inp = new Scanner(System.in);
        r = inp.nextInt();
        alpha = inp.nextDouble();
        double area = (pi * (r*r) * alpha) / 360;

        System.out.print("Enter the radius of the circle");
        System.out.println("Area of the circle:" + area );

    }
}