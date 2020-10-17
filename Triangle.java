import java.util.Scanner;

public class Triangle
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What character do you want your triangle to be made of?");
        String c = sc.next();
        System.out.println("How tall would you like your triangle?");
        int x = sc.nextInt();
        System.out.println("Your triangle:");
        for(int i = 1; i <= x; i++){
            for(int n = 1; n <= i; n++) System.out.print(c);
            System.out.println("");
        }
    }
}
