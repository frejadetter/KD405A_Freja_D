
public class Dog extends Mammal {
	
	
	private Boolean stupid = false;
	protected String friendlyName;
	
	
	
	public Dog(String latinName, int gestationTime, Boolean stupid){
		super(latinName, gestationTime);
		this.stupid = stupid;
	
	}
	public Dog(String latinName, String friendlyName, int gestationTime, Boolean stupid){
		super(latinName, gestationTime);
		this.stupid = stupid;
		this.friendlyName = friendlyName;
	
	}

	
	@Override
	public String getInfo() {
		
		String info;
		
		
		if(friendlyName == null){
		
		if(stupid == true){
			info = "The dog called " + latinName +  " has been pregnant " + gestationTime + " days " + "\n";
			}else{
				info = "The dog called " + latinName +" has been pregnant " + gestationTime + " days and is not stupid " + "\n";
			}
		}else{
			if(stupid == true){
				info = "The dog called " + latinName + " and " + friendlyName + " has been pregnant for " + gestationTime + " days and is stupid " + "\n";
				}else{
					info = "The dog called " + latinName + " & " + friendlyName +" has been pregnant for " + gestationTime + " days and is not stupid " + "\n";
		}
		}
		return info;
		
	}
}
	

	

