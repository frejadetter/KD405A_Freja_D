import java.util.ArrayList;

public class BikeStore {

	/** Returns info if all bikes are String */
	private static ArrayList<Bike> allBikes = new ArrayList<Bike>();

	public static String getAllBikes1() {

		String returnString = " ";
		for (int i = 0; i < allBikes.size(); i++) {
			allBikes.get(i);
			allBikes.get(i);
			allBikes.get(i);
			returnString += ("bikes " + (i + 1) + " is " + Bike.getSize() +"" + " inches,  "+ "\n"+ "has the color "
					+ Bike.getColor() + "\n" + "and costs " + Bike.getPrice() + " dollars" + "\n");
		}
		return returnString;
	}

	
	
	public static void addBike(String color, int size, int price) {
		allBikes.add(new Bike(color, size, price));
	}

}
