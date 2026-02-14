import java.util.Scanner;

public class whilelooppractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Obtained marks: ");
        double ObtainedMarks = scanner.nextDouble();

        System.out.print("Enter the Total Marks: ");
        double TotalMarks = scanner.nextDouble();
        if (TotalMarks > ObtainedMarks) {
             double percentage;

        percentage =  (ObtainedMarks / TotalMarks) * 100;

        System.out.print("Your Percentage is: " + percentage +  "%");
            
        } 
        while (TotalMarks > ObtainedMarks) {
            System.out.print("Obtained marks cannot be greater than Total Marks.");
            System.out.println("Enter Obtained Marks Again");
            double ObtainedMarkss = scanner.nextDouble();    
            System.out.println("Enter Total Marks Again");
            double totallmarks = scanner.nextDouble();
           
            double percentage;
            percentage =  (ObtainedMarkss / totallmarks) * 100;
            System.out.print("Your Percentage is: " + percentage +  "%");
        }  
         
        
        scanner.close();

    }
            
    }

        

    
        

    
    

