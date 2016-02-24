
public class Cat extends Mammal  {
	

	protected int numberOfLifes;


public Cat(String latinName, int gestationTime, int numberOfLifes) {
	super(latinName, gestationTime);
	this.numberOfLifes = numberOfLifes;

}

public int getNumberOfLifes() {
	return numberOfLifes;
}


public void setNumberOfLines(int numberOfLifes) {
	this.numberOfLifes = numberOfLifes;
}



@Override
public String getInfo() {
	String info;
	
	info = "The cat called  " + latinName + " and has been pregnant " + gestationTime + " days and has " + numberOfLifes +  " lives " + "\n";
	
	return info;
}
}