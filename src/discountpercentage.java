import java.util.Scanner;
public class discountpercentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original price: ");
        double originalPrice = scanner.nextDouble();

        System.out.print("Enter the discount amount: ");
        double discountAmount = scanner.nextDouble();

        double discountPercentage = (discountAmount / originalPrice) * 100;

        System.out.println("The discount percentage is: " + discountPercentage + "%");
        // git pr add nhi kia abhi

        scanner.close();
    }
    
}
