import java.util.Scanner;
public class powerclaculation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value Of Voltage:" );
        double V = sc.nextDouble();  
    
        System.out.println("Enter The Value Of Current");
        double A = sc.nextDouble();     
        
        double p = V * A;

        System.out.println("The Power Is; " + p + "Watts");
        sc.close();
    }
}
    

