import java.util.Scanner;
import java.util.ArrayList;


public class Menu {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		do {
			choice = menu(scanner);
			System.out.println();
			
			if (choice == 1) {

				ArrayList<Pizza> pizzas = new ArrayList<>();
				
				System.out.println("How many Pizzas you want to have");
				
				int totalPizzas = scanner.nextInt();
				
				
				
				for (int i=0; i< totalPizzas;++i) {
					Pizza pizza = new Pizza();
					ArrayList<String> toppings = new ArrayList<>();
					
					String pizzaSize;
					System.out.println("Select the Size of Pizza Large, Medium, Small");
					pizzaSize = scanner.next();
					pizza.setSizes(pizzaSize);
					
					String pizzaCurst;
					System.out.println("Select Crust for your Pizza : Thin or Thick");
					pizzaCurst = scanner.next();
					pizza.setCrusts(pizzaCurst);
					
					String pizzaType;
					System.out.println("Select type of Pizza :  Vegan, Vegetarian, Nonveg");
					pizzaType = scanner.next();
					pizza.setTypes(pizzaType);
					
					int totalToppings;
					System.out.println("How many toppings you want for your Pizza.");
					totalToppings = scanner.nextInt();
					
					for (int j = 0;j<totalToppings;++j) {
						System.out.println("Select your toppings : Tomato, Jalapeno, Spinach, Cheese, Mushroom");
						String topping = scanner.next();
						toppings.add(topping);
					}
					
					pizza.setToppings(toppings);
					pizzas.add(pizza);
					
				}
				
				OrderingPizza order = new OrderingPizza(pizzas);
				order.calculateTotalOrderCost();
				order.displayOrder();
				
			}
				
			else if(choice == 2) {
				ArrayList<Pasta> pastas = new ArrayList<>();
				System.out.println("How many Pastas you want");
				
				int totalPasta = scanner.nextInt();
				
				for(int i=0 ; i<totalPasta;++i) {
					 Pasta pasta = new Pasta();
					 
					 String pastaflavors;
					 System.out.println("Which sauce you want for your Pasta : WhiteSauce or RedSauce");
					 pastaflavors = scanner.next();
					 pasta.setFlavors(pastaflavors);
					 
					 String pastaTypes;
					 System.out.println("Which type of Pasta you want to have : Penne or Ditalini");
					 pastaTypes = scanner.next();
					 pasta.setPastaTypes(pastaTypes);
					 
					 pastas.add(pasta); 
				}
				
				OrderingPasta order = new OrderingPasta(pastas);
				order.calculateTotalOrderCost();
				order.displayOrder();
				
			}
				
			else {
				System.out.print("Thank you for using our servies. Please do visit us again");
			}
			
		}while(choice != 3);
		
	}
		
		public static int menu(Scanner scanner) {
			System.out.println("==================================================================");
			System.out.println("==================================================================");
			System.out.println("Welcome to An Italian Affair!");
			System.out.println("1. Order Pizza");
			System.out.println("2. Order Pasta");
			System.out.println("3. Already eat too much");
			
			int choice;
			
			do {
				System.out.print("Enter choice: ");
				choice = scanner.nextInt();
			}while(choice < 1 || choice > 3);
			return choice;
			
		}



}
