package whattoEat;

import java.util.Scanner;

public class Food {
		
	public static void main(String[] args) {
			
		//create scanner output 
		Scanner input = new Scanner(System.in); 
		
		//input prompt 
		System.out.println("Please input Casual, Semi-Formal, or Formal for your dinner type: ");
				
		String eventType = input.nextLine();
		
		//System.out.println("You have selected: " + eventType); - To check input
		//Second input prompt
		Scanner inputtwo = new Scanner(System.in);
		
		System.out.println("Please input numerically the expected number of attendees: ");
		
		int partySize = inputtwo.nextInt();
		
		//System.out.println("You have selected: " + partySize); - To check input
		//Could also run code here to check if inputs are valid (is partySize actually numeric, is eventType one of the requested inputs)
		
		
			
		
		if(eventType.equals("Casual")){
			if(partySize > 12) {
				String result = "Since you are hosting " + Integer.toString(partySize) + " people in a casual setting, you should serve sandwiches prepared by a caterer";
				System.out.println(result);}
			
			if(partySize == 1) {
				String result = "Since you are eating a casual meal alone, you should microwave a sandwich";
				System.out.println(result);}
			
			if(partySize < 13 && partySize > 1) {
				String result = "Since you're hosting " + Integer.toString(partySize) + " people for a casual event, you should prepare a sandwich in the kitchen";
				System.out.println(result);}
		}
		if(eventType.equals("Semi-Formal")){
			if(partySize > 12) {
				String result = "Since you're hosting " + Integer.toString(partySize) + " people in a semi-formal setting, you should serve fried chicken prepared by a caterer";
				System.out.println(result);}
			
			if(partySize == 1) {
				String result = "Since you are eating a semi-formal meal alone, you should microwave some fried chicken";
				System.out.println(result);}
			
			if(partySize < 13 && partySize > 1) {
				String result = "Since you're hosting " + Integer.toString(partySize) + " people in a semi-formal gathering, you should prepare fried chicken in the kitchen";
				System.out.println(result);}
		}
		if(eventType.equals("Formal")){
			if(partySize > 12) {
				String result = "Since you're hosting " + Integer.toString(partySize) + " people in a formal setting, you should serve chicken parmesan prepared by a caterer";
				System.out.println(result);}
			
			if(partySize == 1) {
				String result = "Since you are eating a formal meal alone, you should microwave some chicken parmesan";
				System.out.println(result);}
			
			if(partySize < 13 && partySize > 1) {
				String result = "Since you're hosting " + Integer.toString(partySize) + " people in a formal gathering, you should prepare chicken parmesan in the kitchen";
				System.out.println(result);} 
			}
		}
	
	
	
}
