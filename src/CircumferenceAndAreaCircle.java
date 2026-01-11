import java.util.Scanner;

public class CircumferenceAndAreaCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Radius Of Circle: ");
        double Radius = scanner.nextDouble();
        double Circumference = 2 * Math.PI * Radius;
        double Area = Math.PI * Radius *Radius;

        System.out.println("The Circumference Of Circle Is: " + Circumference );
        System.out.println("The Area Of Circle Is: " + Area );

        scanner.close();
    } 
}
