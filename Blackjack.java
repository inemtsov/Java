import java.util.Scanner;
import java.util.Random;   //needed for the random class.

/**
  players get two cards to start with, and then they are asked whether or not they want more cards. 
  Players can continue to take as many cards as they like. Their goal is to get as close as possible 
  to a total of 21 without going over. Face cards have a value of 10.
  the program should generate random number between 1 and 10 each time the player gets a card. 
  It should keep a running total of the players cards, and ask the player whether or not it should deal another card.  
*/

public class Blackjack
{
   public static void main(String[] args)
   {
       int firstCard, secondCard, anotherCard, Total=0;
       char answer, again;	//first char of user response
       String input; 		//user response
    	  
       Scanner keyboard = new Scanner(System.in);
       Random randomNumber = new Random();
       
       do
       {
	  //generating two numbers by random class; print and add them together.
          firstCard=randomNumber.nextInt(10)+1;
          secondCard=randomNumber.nextInt(10)+1;
          System.out.println("First Cards: " + firstCard + ", " + secondCard);
          Total = firstCard+secondCard;
	  System.out.println("Total: " + Total);
	  
	  //promt the user to print letter y(es) or n(o).
	  System.out.print("Do you want another Card? (y/n): ");
	  input = keyboard.nextLine();
	  answer = input.charAt(0);
	  
	  //validate user input
	  while (answer == 'y' && Total < 21)
	  {	
	   
	     anotherCard=randomNumber.nextInt(10) + 1;
	     System.out.println("card: " + anotherCard);
	     Total += anotherCard;   //summarize random cards. 
	     System.out.println("Total: " + Total);
	
	     //validate the running total.
	     if (Total > 21)
	     {
	        System.out.println("BUST!");
	     }
	     else if (Total == 21)
	     {
	        System.out.println("You Won!");
     	     }
	     else
	     {
	        System.out.print("Do you want another Card? (y/n): ");
                input = keyboard.nextLine();
                answer = input.charAt(0);
	     }
	  }
	  //promt the user to play again.
	  System.out.print("Do you want play again? (y/n): ");
          input = keyboard.nextLine();
          again = input.charAt(0);
       }while(again == 'y');	
   }
}
