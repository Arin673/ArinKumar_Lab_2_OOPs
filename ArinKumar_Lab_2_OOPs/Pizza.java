import java.util.ArrayList;

public class Pizza {

	private String sizes;
	private String crusts;
	private String types;
	private ArrayList<String> toppings ;
	
	
	public String getSizes() {
		return sizes;
	}
	public void setSizes(String sizes) {
		this.sizes = sizes;
	}
	public String getCrusts() {
		return crusts;
	}
	public void setCrusts(String crusts) {
		this.crusts = crusts;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	public ArrayList<String> getToppings() {
		return toppings;
	}
	public void setToppings(ArrayList<String> toppings) {
		this.toppings = toppings;
	}

	@Override
	public String toString() {
		return "Pizza [sizes=" + sizes + ", crusts=" + crusts + ", types=" + types + ", toppings=" + toppings + "]";
	}
	
	
	
	
}
