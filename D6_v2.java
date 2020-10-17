import java.util.Scanner;
public class D6_v2{
    public static void main (String[] args){
        boolean running = true;
        while(running){
            Scanner sc = new Scanner(System.in);
            System.out.println("How many D6's do you want to roll?");
            int n = sc.nextInt();
            int total = 0;
            System.out.print("You rolled: ");
            for(int i = 0; i < n; i++){
                int roll = (int) (Math.random()*6+1);
                System.out.print(roll + " ");
                total += roll;                
            }
            System.out.println("");
            System.out.println("Total: " + total);
            System.out.println("Do you want to roll again? (y/n)");
            String input = sc.next();
            if(input.equals("n")){
                running = false;
                System.out.println("Goodbye!");
            }
        }
    }
}