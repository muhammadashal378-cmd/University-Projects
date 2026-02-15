import java.util.Scanner;
public class numberofyeasanddays {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter The Number Of Minutes: ");
        Long minutes = read.nextLong();
        long years = minutes/525600;
        long days = (minutes%525600)/1440;
        long seconds = (minutes%525600)%1440*60;
        long weeks = (minutes%525600)/10080;
    
        System.out.println(minutes + " Minutes Is Equal To " + years + " Years,  " + days + " Days,  " + weeks + " Weeks And " + seconds + " Seconds");
    }
    
}
