// Import the necessary library
import java.util.Scanner;
// Define Class MonthlyTemperature
public class MonthlyTemperature {
	// Define the main method
	public static void main(String[] args) {
		// Create Scanner object
		Scanner scanner = new Scanner(System.in);
		// Declaring variables to store the months and temperature
		String[] Months = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
        float[] Temperature = new float[12];
        // Declare variable to store highest temperature
        float HighestAvgTemperature = 0;
        // Declare variable to store lowest temperature
        float LowestAvgTemperature = 100;        
        //To input the temperature for every month
        for(int i=0; i<Months.length; i++) {
        	System.out.println("Enter the temperature for the month of "+ Months[i] + ": ");
        	Temperature[i] = scanner.nextFloat();
        }
        // Prompt user to enter month or year to display the average temperature
        System.out.println("Enter name of month or year to display the average temperature : ");
        String UserInput = scanner.next(); 
        // Declared variable to store all the temperature of the year and set highest and lowest average temperature of the year
        float TotalYearlyTemperature = 0;
        for( int i=0; i< Temperature.length; i++ ) {
        	TotalYearlyTemperature += Temperature[i];
        	if(Temperature[i] > HighestAvgTemperature) {
        		HighestAvgTemperature = Temperature[i];
        	}
        	if(Temperature[i] < LowestAvgTemperature) {
        		LowestAvgTemperature = Temperature[i];
        	}
        }  
        // Declare variable to find average yearly temperature
        float AverageYearlyTemperature = TotalYearlyTemperature / 12;
        // Declare variable to find out selected month's temperature
        float SelectedMonthTemperature = 0;
        for(int i=0; i<Months.length; i++) {
        	if(Months[i].equalsIgnoreCase(UserInput)) {
        		SelectedMonthTemperature = Temperature[i];
        		break;
        	}
        }   
        // Declared variable to set the condition to find the average temperature of month or year
        boolean condition = false;
        for(int i=0; i<Months.length; i++) {
        	if(Months[i].equalsIgnoreCase(UserInput)) {
        		condition = true;
        		break;
        	}
        }
        if(condition == true) {		
	    	System.out.println("The temperature of entered month " + UserInput + " is " + SelectedMonthTemperature + " Farenheit." );
        } else {
        	while(!UserInput.equalsIgnoreCase("Year")) {
        		System.out.println("Invalid Input. Please enter 'Year'.");
    			UserInput = scanner.next();
        	}
    		for(int i=0; i<Months.length; i++ ) {
    	        System.out.println("Average Temperature for the month of " + Months[i] + " : " + Temperature[i]);
        	}
	       	System.out.println("The average yearly temperature of entered year " + UserInput + " is " + AverageYearlyTemperature + " Farenheit." );
			System.out.println("Highest Monthly Average : " + HighestAvgTemperature);
			System.out.println("Lowest Monthly Average : " + LowestAvgTemperature);        				
        }
        //closing the scanner
		scanner.close();		
  	}    	
}
