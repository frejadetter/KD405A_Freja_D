
public class Snake extends Animals {
	
	private Boolean poisonus = false;
	
	
	public Snake(String latinName, Boolean poisonus){
	super(latinName);
	this.poisonus = poisonus;

}
	public Boolean getPoisonus() {
		return poisonus;
	}
	
	
	@Override
	public String getInfo() {
		
		String info;
	
		if(poisonus == true){
		info = "Ormens namn är " + latinName + " är giftig" + "\n";
		}else{
			info = "Ormens namn är " + latinName + " och är inte giftig" + "\n";
		}

		return info;
		
	}
}