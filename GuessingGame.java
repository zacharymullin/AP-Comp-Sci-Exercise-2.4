import java.util.Scanner;

public class GuessingGame
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = (int) (Math.random()*100+1);
        int guess = 0;
        int guessNum = 0;
        boolean guessing = true;
        System.out.println("I have a random number between 1 and 100. Guess what it is!");
        while(guessing){
            guessNum++;
            System.out.println("What is your guess?");
            guess = sc.nextInt();
            if(guess == number) guessing = false;
            else if(guess > number) System.out.println("Too high.");
            else if(guess < number) System.out.println("Too low.");
        }
        System.out.println("Correct! It only took " + guessNum + " tries.");
    }
}
