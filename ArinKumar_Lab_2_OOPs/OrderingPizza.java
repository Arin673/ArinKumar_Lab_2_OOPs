import java.util.ArrayList;

public class OrderingPizza {

	private double totalOrderCost;
	
	private final ArrayList<Pizza> pizzas;
	
	public OrderingPizza(ArrayList<Pizza> pizzas) {
		this.pizzas= pizzas;
	}
	
	
	public void calculateTotalOrderCost() {

		
		
	for (Pizza pizza: pizzas) {
		switch ( pizza.getTypes()) {
		case Constant.Pizza_type_Vegan: 
			switch(pizza.getSizes()) {
			case (Constant.Pizza_Size_Large):
				totalOrderCost += Constant.Pizza_type_Vegan_Cost * 3;
				break;
			case Constant.Pizza_Size_Medium:
				totalOrderCost += Constant.Pizza_type_Vegan_Cost * 2;
				break;
			case Constant.Pizza_Size_Small:
				totalOrderCost += Constant.Pizza_type_Vegan_Cost * 1;
				break;
			}
		case Constant.Pizza_type_Vegetarian:
			switch(pizza.getSizes()) {
			case (Constant.Pizza_Size_Large):
				totalOrderCost += Constant.Pizza_type_Vegetarian_Cost  * 3;
				break;
			case Constant.Pizza_Size_Medium:
				totalOrderCost += Constant.Pizza_type_Vegetarian_Cost * 2;
				break;
			case Constant.Pizza_Size_Small:
				totalOrderCost += Constant.Pizza_type_Vegetarian_Cost * 1;
				break;
			}
		case Constant.Pizza_type_Nonveg:
			switch(pizza.getSizes()) {
			case (Constant.Pizza_Size_Large):
				totalOrderCost += Constant.Pizza_type_Nonveg_Cost * 3;
				break;
			case Constant.Pizza_Size_Medium:
				totalOrderCost += Constant.Pizza_type_Nonveg_Cost * 2;
				break;
			case Constant.Pizza_Size_Small:
				totalOrderCost += Constant.Pizza_type_Nonveg_Cost * 1;
				break;
			}
		}
		
		int totalToppings = pizza.getToppings().size();
		totalOrderCost += totalToppings * Constant.Topping_Cost;
		
	}
		
}


	public double getTotalOrderCost() {
		return totalOrderCost;
	}
	
	public void displayOrder() {
		for( Pizza pizza: pizzas) {
			System.out.println("Here is your "+ pizza.getCrusts() +" " + pizza.getSizes() +" "+pizza.getTypes()+" Pizza with toppings "+pizza.getToppings());
			System.out.println("");
		}
		System.out.println("Your Bill for today's order "+ getTotalOrderCost() + "$");
		System.out.println("");
	}
	
	
	
}	
