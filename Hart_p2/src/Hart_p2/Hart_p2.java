package Hart_p2;


import java.util.Scanner;


public class Hart_p2 {


	public static void main(String[] args) {
		
	Scanner scnr = new Scanner(System.in);
	  double weight; 
	  double height;
	  int Choice;
	  double BMI = 0;
	  
	  //Displays dialogue.
	  System.out.print("----------------------------------------------------------\n" + "           Body mass calculator (BMI)\n" + " The formula and the standard used in this application are\n from the Department of Health and Human Services/National\n Institutes of Health so the user can evaluate his/her BMI: \n" + "----------------------------------------------------------\n");

	  //Asks user to enter height and weight.
	  System.out.print("Please enter your weight in pounds or kilograms: ");
	  weight = scnr.nextDouble();

	  System.out.print("Please enter your height in inches or meters: ");
	  height = scnr.nextDouble();
	  
	  //Ask the user to calculate in pounds or kilograms
	  System.out.print("Press 1 to calulate BMI in (pounds and inches) or 2 for (kilograms and meters): ");
	  Choice = scnr.nextInt();
	  
	  //Calculates your BMI and displays it.
	  if(Choice <= 1)
	  {
		  BMI = (weight*703)/ Math.pow(height,2);
	  }
	  else
	  {
		 BMI = weight / Math.pow(height,2);
	  }
	  System.out.print("Your BMI = " + BMI + "\n");
	  System.out.print("\n\n----------------------------------------------------------\n");

	  //Prints the BMI values.
	  System.out.print("BMI VALUES\n");

	  System.out.print("Underweight: less than 18.5");
	  
	  if(BMI < 18.5)
	  {
		 System.out.print("   (*)");
	  }

	  	System.out.print("\nNormal:      between 18.5 and 24.9");

	  if(BMI >= 18.5)
	  {
	    if(BMI <= 24.9)
	    System.out.print("   (*)");
	  }

	  System.out.print("\nOverweight:  between 25 and 29.9");

	  if(BMI >= 25)
	  {
	    if(BMI <= 29.9)
	    System.out.print("   (*)");
	  }

	  System.out.print("\nObese:       30 or greater");

	  if(BMI >= 30)
	  {
		System.out.print("   (*)\n");
	  }

	  System.out.print("\n----------------------------------------------------------");
	}
}
