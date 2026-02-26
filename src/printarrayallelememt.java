import java.util.Scanner;
public class printarrayallelememt {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        for(int i = 0; i < num.length; i++)
        {
            System.out.print("Enter Number " + (i+1) + " is :");
            num[i] = sc.nextInt();
        }
        System.out.print("Entered numbers Are:");
        for(int i =0; i<num.length; i++)
        {
            System.out.print( num[i] + " ");             
        }
        sc.close();
    }
    
}
