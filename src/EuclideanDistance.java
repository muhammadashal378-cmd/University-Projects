import java.util.Scanner;
public class EuclideanDistance {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter the coordinates of x:");
        double x = read.nextDouble();

        System.out.println("Enter the coordinates of y:");
        double y = read.nextDouble();

        double distance = Math.sqrt(x*x + y*y);
        System.out.println("The Euclidean distance from the origin to the point (" + x + ", " + y + ") is: " + distance);
        
        read.close();

        
    }

    
}
