package presentation;
import java.util.Scanner;

public class BloodTypeMealPlannerApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// get user to input blood type - A, B, O, AB
				System.out.print("Enter your blood type: A B O AB:  ");
				String bloodType = scanner.nextLine();
				
				if("A".equalsIgnoreCase(bloodType)) {
					System.out.println("\nBLOOD TYPE 'A' \n- A meat-free diet based on fruits and vegetables, beans and legumes, and whole grains"
							+ "\n -- ideally, organic and fresh.");
				}
				
				else if("B".equalsIgnoreCase(bloodType)) {
					System.out.print("\nBLOOD TYPE 'B' \n- Avoid chicken, corn, wheat, buckwheat, lentils, tomatoes, peanuts, and sesame seeds."
							+ "\nEncouraged to eat green vegetables, eggs, certain meats, and low-fat dairy.");
				}
				
				else if("O".equalsIgnoreCase(bloodType)) {
					System.out.print("\nBLOOD TYPE 'O' \n- A high-protein diet heavy on lean meat, poultry, fish, and vegetables, "
							+ "\nand light on grains, beans, and dairy.");
				}
				
				else if("AB".equalsIgnoreCase(bloodType)) {
					System.out.print("\nBLOOD TYPE 'AB' \n- Foods to focus on include tofu, seafood, dairy, and green vegetables."
							+ "\nAvoid caffeine, alcohol, and smoked or cured meats.\n\n");
				}
				
					
				// ask user which meal they would like to choose food items for - Breakfast, Lunch, Dinner, Snack
				System.out.println("Which meal would you like to choose food items for: (B)Breakfast  (L)Lunch  (D)Dinner or (S)Snack? ");
				String mealType = scanner.nextLine();
				
				if("B".equalsIgnoreCase(mealType)) {
					System.out.print("You choose BREAKFAST to select food items for!");
				}
				
				if("L".equalsIgnoreCase(mealType)) {
					System.out.print("You choose LUNCH to select food items for!");
				}
				
				if("D".equalsIgnoreCase(mealType)) {
					System.out.print("You choose DINNER to select food items for!");
				}
				
				if("S".equalsIgnoreCase(mealType)) {
					System.out.print("You choose SNACK to select food items for!");
				}
				
				
				
				
				// Allow user to choose specific items from FoodChoices to create a well balanced meal
				// When specific # of each food group has been chosen do not allow more choices
				// Prompt user to say meal plan complete - Y or N
				// Display the MealTime = food choices given in a column format
				
				
	}

}
