import java.util.Scanner;
public class SwapNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number");
        double num1 = sc.nextDouble();
         
        System.out.println("Enter The Second Number");
        double num2 = sc.nextDouble();

        double swap = num1;
        num1 = num2;
        num2 = swap;
        System.out.println("After swapping, First Number is " + num1 + " and Second Number is " + num2);
    }
    
}
