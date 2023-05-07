package business;

import java.util.Scanner;

public class mealTime {

	public static void main(String[] args) {
		
		mealTime task = new mealTime();
		
	 {
		int i=0,choice=0,index=0;
		String ch;
		Scanner input = new Scanner(System.in);
		String selected[] = new String[50];

		String protein[] = {"1. Artichoke Spinach Dip","2. Cheesy Pull-Apart Bread","3. Fontina-Stuffed, Bacon-Wrapped Dates","4. Homemade Restaurant-Style Salsa","5. Hot Corn and Cheese Dip","6. Loaded Baked Potato Dip","7. Pepperoni Bread","8. Slow Cooker Spicy Beef Queso Dip","9. Sun-Dried Tomato Dip","10. Zesty Two-Ingredient Cream Cheese Dip"};
		String carbs[] = {"1. The Hamburger","2. Clam Chowder","3. Bagel and Lox","4. Deep-Dish Pizza","5. Drop Biscuits and Sausage Gravy","6. Texas Barbecue","7. Hominy Grits"};
		String fruit[] = {"1. Pumpkin pie","2. Baked Alaska","3. Boston cream pie","4. Red velvet cake","5. Bananas Foster","6. Banana pudding","7. Shave ice "};
		String vegetable[] = {"1. Pumpkin pie","2. Baked Alaska","3. Boston cream pie","4. Red velvet cake","5. Bananas Foster","6. Banana pudding","7. Shave ice "};
		String beverage[] = {"1. Pumpkin pie","2. Baked Alaska","3. Boston cream pie","4. Red velvet cake","5. Bananas Foster","6. Banana pudding","7. Shave ice "};
		mealTime();
		
		
		System.out.print(System.lineSeparator() + "List of available proteins: ");
		for(i=0; i<protein.length; i++)
		System.out.print(System.lineSeparator() + protein[i]); 
		addprotein();

		System.out.print(System.lineSeparator() + "************************************");
		System.out.print(System.lineSeparator() + "List of available carbohydrates: ");
		for(i=0; i<carbs.length; i++)
		System.out.print(System.lineSeparator() + carbs[i]);
		addcarbs();

		System.out.print(System.lineSeparator() + "************************************");
		System.out.print(System.lineSeparator() + "List of available fruits: ");
		for(i=0; i<fruit.length; i++)
		System.out.print(System.lineSeparator() + fruit[i]);
		addfruit();

		show();

		}
	 
		void addprotein();
		
		System.out.print(System.lineSeparator() + "************************************");
		while(true) {
		System.out.print(System.lineSeparator() + "Enter your choice for protein: ");
		choice = Integer.parseInt(input.nextLine());
		selected[index++] = protein[choice-1];
		System.out.print(System.lineSeparator() + "Do you want to add more proteins to your meal (Y/N): ");
		ch = input.nextLine();
		if(ch.equalsIgnoreCase("N")) {
		break;
		}
		
		void addcarbs(); 
		}

			
		{
		System.out.print(System.lineSeparator() + "************************************");
		while(true) {
		System.out.print(System.lineSeparator() + "Enter your choice for carbs: ");
		choice = Integer.parseInt(input.nextLine());
		selected[index++] = carbs[choice-1];
		System.out.print(System.lineSeparator() + "Do you want to add more carbohydrates to your meal (Y/N): ");
		ch = input.nextLine();
		if(ch.equalsIgnoreCase("N")) {
		break;
		}
		
		}


		void addcarbs();
	
		System.out.print(System.lineSeparator() + "************************************");
		while(true) {
		System.out.print(System.lineSeparator() + "Enter your choice for fruit: ");
		choice = Integer.parseInt(input.nextLine());
		selected[index++] = fruit[choice-1];
		System.out.print(System.lineSeparator() + "Do you want to add more fruits to your meal (Y/N): ");
		ch = input.nextLine();
		if(ch.equalsIgnoreCase("N")) {
		break;
		}
		}
		void show() //show selected items
		{
			
		System.out.print(System.lineSeparator() + "************************************");
		
		System.out.print(System.lineSeparator() + "Following is your selected meal items");
		for(i=0; i<index; i++);
		System.out.print(System.lineSeparator() + selected[i]);
		}
		
	}
}
		
	}


