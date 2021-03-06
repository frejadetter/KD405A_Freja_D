
public class Bike {
	/** Defining variables for the class Bike */
	private static String color;
	private static int price;
	private static int size;

	public Bike(String color, int size) {
		this.color = color;
		this.size = size;

	}

	/** Constructors, creates bikes with colors, sizes and prices */
	public Bike(String color, int size, int price) {

		for (int i = 0; i < Constants.bikeColors.length; i++) {
			if (0 == color.compareTo(Constants.bikeColors[i].toString())) {

				this.color = color;
				break;
			} else {

				this.color = "wrong color";
			}
		}

		if (size >= Constants.MIN_SIZE && size <= Constants.MAX_SIZE) {

			this.size = size;

		} else {
			
			this.size = 0;

		}

		if (price >= Constants.MIN_PRICE && price <= Constants.MAX_PRICE) {
	

			this.price = price;

		} else {

			this.price = 0;
		}
	}

	/** METHODS */
	public static String getColor() {
		return color;

	}

	public static int getSize() {
		return size;
	}

	public static int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
