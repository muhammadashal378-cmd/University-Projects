import java.util.Scanner;
public class PercentageCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Obtained marks: ");
        double ObtainedMarks = scanner.nextDouble();

        System.out.print("Enter the Total Marks: ");
        double TotalMarks = scanner.nextDouble();

        double percentage;

        percentage =  (ObtainedMarks / TotalMarks) * 100;

        System.out.print("Your Percentage is: " + percentage +  "%");

        scanner.close();
    }
}
    

