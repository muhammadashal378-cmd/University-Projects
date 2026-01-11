import java.util.Scanner;
public class CalculateDiscount {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original price: ");
        double originalPrice = scanner.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercentage = scanner.nextDouble();

        double discountAmount = (discountPercentage / 100) * originalPrice;
        double finalPrice = originalPrice - discountAmount;

        System.out.println("The final price after discount is: " + finalPrice);
        System.out.println("The Price Was; " +  originalPrice);
        System.out.println("Now You Have To Pay Only; "  +  finalPrice);


        scanner.close();

    }
    
}
