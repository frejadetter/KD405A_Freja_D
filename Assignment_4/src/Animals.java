public abstract class Animals {

	protected String latinName;
	protected String friendlyName;


public Animals(String latinName){
	this.latinName = latinName;
}

public abstract String getInfo();


public void setFriendlyName(String friendlyName) {
	this.friendlyName = friendlyName;
}
public String getFriendlyName() {
	return friendlyName;
}
}