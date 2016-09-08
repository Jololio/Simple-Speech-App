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
	}

}
