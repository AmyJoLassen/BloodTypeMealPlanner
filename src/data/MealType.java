package data;
import java.util.Scanner;

//public static main(String[] args) {

public class MealType {

	private String Breakfast;
	private String Lunch;
	private String Dinner;
	private String Snack;
	
	
	
public class FoodGroup {
	private String protein;
	private String eggDairy;
	private String starchCarbGrain;
	private String fruit;
	private String vegetable;
	private String beverage;
	private String oilFatNutSeed;	
	
	public FoodGroup(String protein, String eggDairy, String starchCarbGrain, String fruit, String vegetable) {
		this.protein = protein;
		this.eggDairy = eggDairy;
		this.starchCarbGrain = starchCarbGrain;
		this.fruit = fruit;
		this.vegetable = vegetable;
		}
	
	public String getProtein() {
		return protein;
	}
	public void setProtein(String protein) {
		this.protein = protein;
	}
	
	public String getEggDairy() {
		return eggDairy;
		}
	public void setEggDairy(String eggDairy) {
		this.eggDairy = eggDairy;
	}
	
	public String getStarchCarbGrain() {
		return starchCarbGrain;
	}
	public void setStarchCarbGrain(String starchCarbGrain) {
		this.starchCarbGrain = starchCarbGrain;
	}
		
	public String getFruit() {
		return fruit;
	}
	public void setFruit(String fruit) {
		this.fruit = fruit;
	}
	
	public String getVegetable() {
		return vegetable;
	}
	public void setVegetable(String vegetable) {
		this.vegetable = vegetable;
	}
	
	public String getBeverage() {
		return beverage;
	}
	public void setBeverage(String beverage) {
		this.beverage = beverage;
	}
	
	public String OilFatNutSeed() {
		return oilFatNutSeed;
	}
	public void setOilFatNutSeed(String oilFatNutSeed) {
		this.oilFatNutSeed = oilFatNutSeed;
	}
	
	//public MealType build() {
		//return new MealType(protein, fruit, starchCarbGrain, vegetable, eggDairy);
	//}
	}

public class Main {
	public static void main(String[] args) {
		System.out.println("Which meal type would you like to build? ");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
	}
}
	
}



