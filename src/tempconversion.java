import java.util.Scanner;
public class tempconversion {
    public  static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter The Temperature In Farenhite:");
        double F = read.nextDouble();
        double C = (F - 32) * 5/9;
        System.out.println(F + " Farenhite Is Equal To " + C + " Celsius");
        read.close();
    }
    
}
