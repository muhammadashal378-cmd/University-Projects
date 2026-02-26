import java.util.Scanner;

public class array {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        // Declare array of size 5
        int[] numbers = new int[5];

        int sum = 0;
        int max;

        // Input 5 numbers
        for(int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Assume first element is maximum
        max = numbers[0];

        // Calculate sum and find maximum
        for(int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];

            if(numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Display results
        System.out.println("\nSum of array elements: " + sum);
        System.out.println("Maximum number: " + max);

        sc.close();
    }
}
    

