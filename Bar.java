import java.util.Scanner;
public class Bar
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your character:");
        String c = sc.next();
        System.out.println("Enter the number of times you would like it printed:");
        int x = sc.nextInt();
        System.out.println("Your bar:");
        for(int i = 0; i < x; i++) System.out.print(c);
    }   
}
