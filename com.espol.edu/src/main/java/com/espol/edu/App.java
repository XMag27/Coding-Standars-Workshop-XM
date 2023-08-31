package com.espol.edu;
import java.util.Scanner;
public class App {

   public static void main(String[] args) {
	String destination;
	int travelers;
	int duration;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Welcome!");
	System.out.println("Where are you travelling?");
	 try {
	  destination = scanner.nextLine();
	 } catch (Exception e) {
	  System.out.println("Error in City name");
	  scanner.close();
	  return;
	  }
	System.out.println("How many people is travelling?");
	  try {
		  travelers = Integer.parseInt(scanner.nextLine());
	  } catch (Exception e) {
		 System.out.println("Error in Travelers Amount");
		 scanner.close();
		 return;
		 }
	  System.out.println("How long will you stay?");
		try {
			duration = Integer.parseInt(scanner.nextLine());
		} catch (Exception e) {
			System.out.println("Error in duration time");
			scanner.close();
			return;
		}
		scanner.close();
		int total = calculate(destination, travelers, duration);
		if (total != -1) {
			System.out.println("The total is: " + total);
		} else {
			System.out.println("We couldnt get you a travel");
		}
	}
   private static int calculate(final String destination, final int travelers, final int duration) {
    int total = 0;
    total = total+1000;
	if (destination.equals("Paris")) {
		total = total + 500;
	}
	if (destination.equals("New York City")) {
		total = total + 600;
	}
	if (4 < travelers && travelers < 10) {
		total = total - (total * 10 / 100);
	}
	if (duration < 7 ) {
		total = total+200;
	}
	if (duration > 30 || travelers == 2) {
		total = total-200;
	}
	if (travelers > 80) {
		total = -1;
	}
	return total;
    }
}
