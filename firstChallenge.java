import java.text.SimpleDateFormat;
import java.text.ParseException; 
import java.util.*;

public class firstChallenge {


//date validation
static boolean validateJavaDate(String strDate) {

if (strDate.trim().equals("")) {
	    return true;
	} else {
	    SimpleDateFormat sdfrmt = new SimpleDateFormat("MM/dd/yyyy");
	    sdfrmt.setLenient(false);
	    
	    try
	    {
	        Date javaDate = sdfrmt.parse(strDate); 
	    }
	    catch (ParseException e) { 
	        return false;
	    }
	    return true;
	}
}
	
	
	//display birthday in hexadecimal, Octal and binary
	static void displayBirthday(int birthDay) {
		String dayToHex = Integer.toHexString(birthDay);
		String dayToOct = Integer.toOctalString(birthDay);
		String dayToBinary = Integer.toBinaryString(birthDay);

		System.out.println("Birthday in Hexadecimal is: " + dayToHex);
		System.out.println("Birthday in Octal is: " + dayToOct);
		System.out.println("Birthday in Binary is: " + dayToBinary );
	}


	//convert distance from kilometers to miles
	static double distanceInMiles(double distanceInKm) {
		double convertedDistance;
		convertedDistance = distanceInKm * 0.62137119;
		return convertedDistance;
	}
	

	static int yearsOld(String birthYear) {
		int outcomeYear = 2021 - Integer.parseInt(birthYear);
		return outcomeYear;
	}

	//convert distance from kilometers to meters
	static double distanceInMeters(double distanceInKm) {
		double convertedDistance;
		convertedDistance = distanceInKm * 1000;
		return convertedDistance;
	}


	//convert age from years to milliseconds
	public static double ageInMilliseconds(int age) {

		double ageInMill = (age * 3.154e+7) * 1000; 
		return ageInMill;
	}

  public static boolean validateInputStrings(String inputName) {
    return inputName.matches("[A-Z][a-zA-Z]*");
  }


	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in); 

		String name = "";
		String surname = "";
		String date_of_birth = "";
		double distance;
		

		System.out.println(" Challenge Part 1 ");
		
		
		//User inputs
		while(true){
			 System.out.println("What is your name: ");
			 name = s.nextLine();
			 if (validateInputStrings(name)){
			 	break;
			 }
		 System.out.println("Invalid first name");	
		}

		
		while(true){
			 System.out.println("What is your surname: ");
			 surname = s.nextLine();
			 if (validateInputStrings(surname)){
			 	break;
			 }
		 System.out.println("Invalid surname");	
		}

		

		while(true){
			 System.out.println("Enter your date of birth: e.g. DD/MM/YYYY: ");
			 date_of_birth = s.nextLine();
			 if (validateJavaDate(date_of_birth)){
			 	break;
			 }
		 	System.out.println("Invalid date");	
		}


		System.out.println("How far is your favourite store from your home? ");
		distance = s.nextDouble();

		System.out.println(" Challenge Part 2" );
		
		//calculate years	
		String year = date_of_birth.split("/")[2];
		int userAge = yearsOld(year);
		int birthday = Integer.parseInt(date_of_birth.split("/")[0]);

		//Output display
		System.out.println(" Challenge Part 3" );
		System.out.println("Hello " + name + " " + surname);
		System.out.println("You are " + userAge + " years old.");		
		System.out.println("Distance in Miles " + distanceInMiles(distance) + " miles");
		System.out.println("Distance in Meters " + distanceInMeters(distance) + " meters");
		System.out.println("Age in milliseconds " + ageInMilliseconds(userAge));
		displayBirthday(birthday);
	
	}

	

}



