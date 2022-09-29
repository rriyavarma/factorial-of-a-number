package lab4;

public class Android_Main {


		public static void main(String args[]){
	    	
	    AndroidPhone a1 = new AndroidPhone("Samsung", 8, "purple");
        AndroidPhone a2 = new AndroidPhone("Vivo", 4, "blue");
        AndroidPhone a3 = new AndroidPhone("Redmi", 8, "Black");
        
        AndroidPhone[] arr = new AndroidPhone[3];
        arr[0] = a1;
        arr[1] = a2;
        arr[2] = a3;
        for(AndroidPhone a: arr);
        {
        	
			System.out.println(a.name + " " a.ram + " " a.colour);
        }
	    
	
	    }
}