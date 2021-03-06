
public class House {


		private int yearBuilt;
		private int size;
		private static int minSize = 10;
		private static int maxSize = 1000;
		private static int minYear = 1800;
		private static int maxYear = 2015;
		
		public House(int yearBuilt,int size){
		
			if (size < minSize){
				size = minSize;
			}
			
			if (size > maxSize){
				size = maxSize;
			}
			
			if (yearBuilt < minYear){
				yearBuilt = minYear;
			}
			
			if (yearBuilt > maxYear){
				yearBuilt = maxYear;
			}
			
			
			this.yearBuilt = yearBuilt;
			this.size = size; 
			
		}
		public int getYearBuilt(){
			return this.yearBuilt;
			
		}
		public int getSize(){
			return this.size;
			
		}
		
		public static int getMinSize(){
			return minSize;
		}
		
		public static int getMaxSize(){
			return maxSize;
		}
		
		public static int getMinYear(){
			return minYear;
		}
		
		public static int getMaxYear(){
			return maxYear;
		}
		}
	

