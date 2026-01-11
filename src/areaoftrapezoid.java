import java.util.Scanner;
public class areaoftrapezoid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Lenght Of parallel side (a):" );
        double a = sc.nextDouble();

        System.out.print("Enter The Lenght Of parallel side (b):" );
         double b = sc.nextDouble();

         System.out.print("Enter The Lenght Of parallel side (h):" );
        double h = sc.nextDouble();

        double k = h * (a + b)/2;
        System.out.println("The Area Of Trapezoid Is:" + k + " square units");





    }
}
