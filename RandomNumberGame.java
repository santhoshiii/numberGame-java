package NumberGame;
import java.util.Scanner;
import java.util.Random;

public class RandomNumberGame {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name= sc.nextLine();
        
        System.out.println("well, " +name+ ", I am thinking of a number between 1 and 100.");
        System.out.println("you have 10 attempts to guess it correct.");
        
        //1 is inclusive, 101 is exlusive
        int myNumber= getRandomNumber(1, 101);
        
        int score=10;
        for(int i=1; i<11; i++){
           System.out.println();
           System.out.print("Take a guess- ");
           int yourGuess= sc.nextInt();
           
           if(yourGuess==myNumber){
               System.out.println();
               System.out.println("YOU WON !!");
               System.out.println("Your score is: "+score+"/10");
               break;
           }else if(yourGuess<myNumber){
               System.out.println("your guess is too low!");
           }else if(yourGuess>myNumber){
               System.out.println("your guess is too high!");
            } 
           score--;
           
           if(i>=10){
               System.out.println();
               System.out.println("YOU LOST");
               System.out.println("The correct number is "+myNumber+ "!");
           }
        }
    }
    
    public static int getRandomNumber(int min, int max){
        Random random= new Random();
        /* ints is used to generate an infinite stream of random numbers within the range
           findFirst is used to find the first element from the infinite stream
           getAsInt is used to return the integer value of the first element*/
        return random.ints(min,max).findFirst().getAsInt();
    }
}