import java.util.Scanner;

public class Prompter{
  private GuessingGame game;
  private boolean isCorrect = false;
  private int randomNum;
  private int guessNum;
  private int attempts = 1;
  private int maxNum;
  private Scanner scanner = new Scanner(System.in);
  String itemName;
  
  public Prompter(){
  }
  
  void promptForSetup(){
    //Prompt user for item type
    System.out.printf("What type of item do you want? ");
    itemName = scanner.nextLine();
    
    //Prompt user for maximum number of items in jar
    System.out.printf("What is the maximum amount of %s in the jar?  ", itemName);
    maxNum = Integer.parseInt(scanner.nextLine());
    
    //initialize a new jar with a random fill
    Jar jar = new Jar(itemName, maxNum);
    randomNum = jar.randomFiller();
      
  }
  
  void promptForGuess(){
    //Prompt user for guess
    System.out.printf("How many %s in the jar? Pick a number between 1 and %d  ", itemName, maxNum);
      
    do{
      guessNum = Integer.parseInt(scanner.nextLine());
      
      if (guessNum > maxNum)
        System.out.printf("Your guess must be less than %d  ", maxNum);
      else if (randomNum != guessNum){
        System.out.printf("Incorrect. Try again\n");
        attempts++;
      }
      else
        isCorrect = true;
      
      
      
    }while(!isCorrect);
    
    System.out.printf("Well done! You got it in %d attempts!", attempts);
  }
}