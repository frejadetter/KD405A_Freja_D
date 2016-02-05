import java.util.ArrayList;

public class Main {
	
	private static ArrayList <Bike> allbikes = new ArrayList<Bike>();
	private static Bike [] myBikes;
	private JPanel contentPane;
	private ArrayList<Bike> bikes = new ArrayList <Bike>();
	private BikeStore bikeStore = new BikeStore();
	
	public static void main(String[] args) {
		
	
		Bike Bike0 = new Bike("green", 10, 20);
		allbikes.add(Bike0);
		Bike Bike1 = new Bike("red", 10, 20);
		allbikes.add(Bike1);
		Bike Bike2 = new Bike("yellow", 10, 20);
		allbikes.add(Bike2);
		Bike Bike3 = new Bike("silver", 10, 20);
		allbikes.add(Bike3);
		Bike Bike4 = new Bike("gold", 10, 20);
		allbikes.add(Bike4);
		Bike Bike5 = new Bike("purple", 10, 20);
		allbikes.add(Bike5);
		Bike Bike6 = new Bike("white", 10, 20);
		allbikes.add(Bike6);
		Bike Bike7 = new Bike("pink", 10, 20);
		allbikes.add(Bike7);
		Bike Bike8 = new Bike("black", 10, 20);
		allbikes.add(Bike8);
		Bike Bike9 = new Bike("grey", 10, 20);
		allbikes.add(Bike9);
		
		
	int i = 1; 
	for (Bike bikes : allbikes){
		System.out.println("bike " +(i++) + " " + bikes.getSize() + " " + bikes.getPrice() + " " + bikes.getColor() + "\n");
	
		if (bikes.getPrice() < Constants.getMinPrice() || bikes.getPrice() > Constants.getMaxPrice()){
			System.out.println(bikes.getPrice() + " is the wrong price, it should be between " + Constants.getMinPrice() + "and " + Constants.getMaxPrice() + "\n");
		}
		
		if (bikes.getSize() < Constants.getMinSize() || bikes.getSize() > Constants.getMaxSize()){
			System.out.println(bikes.getSize() + " is the wrong size, it should be between " + Constants.getMinSize() + "and " + Constants.getMaxSize() + "\n");
		
		}

		
	
		
	}

	
	
	
}
