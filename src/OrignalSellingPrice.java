import java.util.Scanner;
public class OrignalSellingPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the discounted Selling price:");
        double discountedSellingPrice = sc.nextDouble();
        System.out.print("Enter the Discounted Percentage:");
        double discountPercentage = sc.nextDouble();
        double originalPrice = discountedSellingPrice / (1 - discountPercentage / 100);
        System.out.println("The original price is: " + originalPrice);
        sc.close();
    }
}