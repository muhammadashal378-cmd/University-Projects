import java.util.Scanner;
public class ForceFormula {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        double G = 6.67430e-11; // Gravitational constant

        System.out.println("Enter The Value Of Mass m1");
        double m1 = read.nextDouble();
        
        System.out.println("Enter The Value Of Mass m2");
        double m2 = read.nextDouble();

        System.out.println("Enter The Value Of Distance/Radius r");
        double r = read.nextDouble();
        
        double F = G *m1*m2/r*r;
        System.out.println("The Gravitational Force is: " + F + " Newtons (N)");
    }
    
}
