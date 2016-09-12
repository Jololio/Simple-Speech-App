package stupid.controller;

import java.util.Scanner;

public class StupidController 
{
	private String myName;
	private Scanner readKeyboardInput; 
	
	public StupidController()
	{
		myName = "Hey, my name is Joseph!";
		readKeyboardInput = new Scanner(System.in);
	}
	
	public void start()
	{
		System.out.println("Nice to meet you!");
		System.out.println(myName);
		askQuestions();
	}

	private void askQuestions()
	{
		System.out.println("What is your name?");
		String userInput = readKeyboardInput.next();
		System.out.println("Hello there, " + userInput + "!");
		readKeyboardInput.nextLine();
		
		System.out.println("How old are you?");
		int otherInput = readKeyboardInput.nextInt();
		System.out.println("Wow, you're " + otherInput + "? That's cool!");
		
		System.out.println("What grade are you in?");
		double moreInput = readKeyboardInput.nextDouble();
		System.out.println("Wow, I didn't kndow you were in the " + moreInput + " grade.");
		readKeyboardInput.nextLine();
		
		System.out.println("What kind of Pet do you have?");
		String sickInput = readKeyboardInput.nextLine();
		System.out.println("It must be sick to own a " + sickInput + ".");
		
		System.out.println("What's your favorite color?");
		String greatInput = readKeyboardInput.nextLine();
		System.out.println(greatInput + " is my favorite too!");
		
		System.out.println("What is your Mom's name?");
		String momInput = readKeyboardInput.nextLine();
		System.out.println(momInput + " is a pretty name.");
		
		System.out.println("How many siblings do you have?");
		int siblingInput = readKeyboardInput.nextInt();
		System.out.println("You have " + siblingInput + "? I have none.");
		readKeyboardInput.nextLine();
		
		System.out.println("What's your favorite activity?");
		String activityInput = readKeyboardInput.nextLine();
		System.out.println(activityInput + " sounds pretty fun actually.");
		
		System.out.println("What's your dad's name?");
		String dadInput = readKeyboardInput.nextLine();
		System.out.println(dadInput + " is a pretty sick name to be honest.");
		
		System.out.println("What is your weight?");
		double weightInput = readKeyboardInput.nextDouble();
		System.out.println("Yeah I wish I weighed " + weightInput);
	}

}
