import java.util.Scanner;

public class RunningTally
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers you would like to add: (type a negative number to quit)");
        int n = sc.nextInt(); 
        int total = 0;
        while(n > 0){
           total += n;
           n = sc.nextInt();
        }
        System.out.println("Your total: " + total);
    }
}
