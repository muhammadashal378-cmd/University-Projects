import java.util.Scanner;
public class inchestometer {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter The Lenght In Inches: ");
        double lenght = read.nextDouble();

        double meter = lenght * 0.0254;

        System.out.println(lenght + " Inches Is Equal To " + meter + " Meters");
        read.close();
    }
    
}
