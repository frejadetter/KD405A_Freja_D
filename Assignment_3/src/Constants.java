
public class Constants {
	
	public static final int MAX_SIZE = 28; 
	public static final int MIN_SIZE = 9; 
	public static final int MAX_PRICE = 3000; 
	public static final int MIN_PRICE = 0;
	public static final int MAX_NUMBER_OF_BIKES = 20;

public static final String[] bikeColors = new String[]{"green", "red", "yellow", "silver", "gold", "purple", "white", "pink", "black", "grey"};
	

public static int getMinSize(){
	return MIN_SIZE;
}
		

public static int getMaxSize(){
	return MAX_SIZE;
}


public static int getMinPrice(){
	return MIN_PRICE;
}


public static int getMaxPrice(){
	return MAX_PRICE;
}


public static int getMaxNumberOfBikes(){
	return MAX_NUMBER_OF_BIKES;

}
			
	
public Constants(){

	
}


public static void main(String[]args){
	
	for(int i = 0; i < 9; i++){
		
		System.out.println(bikeColors[i]);
	}
}
	
}


