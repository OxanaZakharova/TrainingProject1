import java.util.Scanner;

public class HiLo {
  
  public static void main (String[] args) {
  
    System.out.println("Welcome to the  HiLo-Game");
    System.out.println("Which level of difficulty would you prefer? ");
    System.out.println("1. Easy (1-10)");
    System.out.println("2. Middle (1-100)");
    System.out.println("3. Difficult (1-1000)");

    Scanner sc = new Scanner(System.in);
    int maxNumber = 0;
    boolean difficultyDetermined = false;
    
    for(; !difficultyDetermined; ){
      int level = sc.nextInt();
      difficultyDetermined = true;
      switch (level) {
        case 1: 
          System.out.println("The level of difficulty is Easy");
          maxNumber = 10;
          break;
        case 2:
          System.out.println("The level of difficulty is Middle");
          maxNumber = 100;
          break;
        case 3: 
          System.out.println("The level of difficulty is Difficult");
          maxNumber = 1000;
          break;
        default:
          difficultyDetermined = false;
          System.out.println("Enter appropriate number");
      }
    } 
            
    int  numberOfAttempts = playGame(maxNumber);
    System.out.println("You guessed with " + numberOfAttempts + " attempts");

  }
   
  public static int playGame(int maxNumber){
     int number =  (int)(Math.random() * maxNumber) + 1;
     Scanner sc = new Scanner(System.in);
     int guess = 0;
     int numberOfAttempts = 0;
   
     do {
       System.out.println("Guess the number between 1 and " + maxNumber );
       guess  = sc.nextInt();
       giveResponse(number, guess);
       numberOfAttempts++;
     } while (number != guess);
     
     return numberOfAttempts;
         
  }
   
   public static void giveResponse(int answer, int guess){
   
     if (answer < guess) 
       System.out.println ("Guess is too high");
     else if (answer > guess) 
       System.out.println ("Guess is too low");
     else   System.out.println ("Congratulations! You are right!");
 
   }
   
}    