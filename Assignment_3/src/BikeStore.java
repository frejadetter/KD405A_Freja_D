import java.util.ArrayList;

public class BikeStore {
	
private ArrayList<Bike> allBikes = new ArrayList<Bike>();
public String getAllBikes1(){
	
	String returnString = "";
	for (int i = 0; i < allBikes.size(); i++){
		returnString += ("bikes " + (i+1) + "is the size " + allBikes.get(i).getSize() + "and is the color" + allBikes.get(i).getColor() + " and has the price " + allBikes.get(i).getPrice() + "\n");
	}
	return returnString;
}

	public void addBike(String color, int size, int price){
	allBikes.add(new Bike(color, size, price));
}



	public BikeStore(String allBikes) {
		this.allBikes = allBikes;
	}

	public String getAllBikes(){
		return this.getAllBikes;
	}
	public void addBikes(Bike s){
		allBikes.add(s);
	}
}
