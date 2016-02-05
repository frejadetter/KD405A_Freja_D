
public class Cat {

	private String color = "grey";
	private String name = "noName";
	private int age = 0;
	private stativ int MAX_AGE = 220; //months 
	
	//Constructors
	
	public Cat(){
		this.name = "Knodden";
	}
	
	public Cat(String color, String name){
		this.color = color; 
		this.name = name;
		
	}
	
	public String getColor() {
		return this.color;
	}
	
	
	public String getName() {
		return this.name;
		
	}
	
	//Sets the age between 0-220 months 
	public void setAge(int age){
		if (age > 0 && age <= MAX_AGE){
			this.age = age;
		}
	}
	
	public int getAge(){
		return this.age;
	}
}
