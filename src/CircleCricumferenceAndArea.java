import java.util.Scanner;
public class CircleCricumferenceAndArea {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Radius Of Circle;");
        double Radius = sc.nextDouble();
        double Area = Math.PI * Radius * Radius;
        double Circumference = 2 * Math.PI * Radius;
        System.out.println("The Area Of Circle Is:" + Area  +"m^2");
        System.out.println("The Circumference Of Circle Is:" + Circumference);
        sc.close();



    }
    
}
