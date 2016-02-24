
public abstract class Mammal extends Animals{

protected int gestationTime;
	

public Mammal(String latinName, int gestationTime){
	super(latinName);
	this.gestationTime = gestationTime;
	
}
public int getGestationTime() {
	return gestationTime;


}
}