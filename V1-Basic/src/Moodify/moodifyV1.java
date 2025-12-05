package Moodify;
import java.util.*;
import java.io.*;
/*
 * This is the first Version which is basically the skeleton version.
 * V1 deals with hard-coded songs.
 * Purpose is for a user to select one of the 5 moods and a list of song choices will be provided
 */
public class moodifyV1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("-------Welcome to Version 1 of Moodify------- ");

		int choice;
		do {
			System.out.println("\n---Select an option of the mood that you're in (1-6)---");
			System.out.println("1. Happy");
			System.out.println("2. Sad");
			System.out.println("3. Angry");
			System.out.println("4. Chill");
			System.out.println("5. Excited");
			System.out.println("6. Exit!");
			
			System.out.print("Enter your choice: ");
			
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("\nYou have selected Happy:");
				songForMood("HAPPY");
				break;
			case 2:
				System.out.println("\nYou have selected Sad:");
				songForMood("SAD");
				break;
			case 3:
				System.out.println("\nYou have Selected Angry:");
				songForMood("ANGRY");
				break;
			case 4:
				System.out.println("\nYou have selected Chill:");
				songForMood("CHILL");
				break;
			case 5:
				System.out.println("\nYou have selected Excited:");
				songForMood("EXCITED");
				break;
			case 6:
				System.out.println("Exiting!");
				break;
			default: 
				System.out.println("\nInvalid choice, please try again");
			}
		}while(choice !=6);
		
		System.out.println("Thanks for using Moodify Version 1");
		sc.close();
	
		}
	
	
	public static void songForMood(String moodHeader) {
		try {
			File inputFile=new File("moodsongs.txt");
			Scanner fileScanner=new Scanner(inputFile);
			boolean foundSection=false;
			
			while(fileScanner.hasNextLine()) {
				String line=fileScanner.nextLine();
				
				if(line.equalsIgnoreCase(moodHeader)) {
					foundSection=true;
					continue;
					}
				if(foundSection==true){
					if(line.trim().equals("")) {
						break;
				}
					System.out.println(line);
					
				}
				
			}
			fileScanner.close();
			
		}catch(Exception e) {
			System.out.println("Error reading moodsongs file");
	}
}

	}
