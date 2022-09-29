package lab4;

public class AndroidPhone {
	  	  
	 String name;
	 int ram;
	 String colour;
	
	 public AndroidPhone(String name, int ram, String colour) {
	 
	
	
	        this.name = name;
	        this.ram = ram;
	        this.colour = colour;
 }
	 @Override
	 public String toString() {
		 return "AndroidPhone [name=" + ram + " , colour=" +colour + "]";
	 }
	 


}