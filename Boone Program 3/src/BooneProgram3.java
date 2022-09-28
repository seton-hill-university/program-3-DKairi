// Application:    Boone Program 3
// Name:           D'Kairi Boone
// GitHub User:    DKairi
// Date:           Sep 26, 2022
//Version:         1.0
//Description:     Loops
import java.util.Scanner;
public class BooneProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//activate keyboard
		Scanner keyboard = new Scanner(System.in);
		
		
		//Asking the user for their name and number
		System.out.print("Name? ");
		String name = keyboard.next();
		System.out.print("Number between 0 and 100?");
		int number = keyboard.nextInt();
		
		//While loop to determine if number is between 0 and 100
		while (number > 100 || number < 0 )
		
		{   System.out.print("Number between 0 and 100?");
			number=keyboard.nextInt();
			if(number <100 && number >0) {
				System.out.println("Thank you for your input " + name);
			}
	
		} 
		
		//For loop that counts down to 0 and gives an output of a comment for count down
		for ( ;number >= 0; number--) 
		{
			  System.out.println("You are now " + number + " away from zero!");
			}
		
		
		
		
		
		
		
		
		
	}


	}
