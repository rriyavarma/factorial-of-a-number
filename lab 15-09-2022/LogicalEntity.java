
import java.util.Scanner;

public class logicalentity {
	
	int id;
	String name;
	String location;
	
	logicalentity(int id) {
		this.id = id;
	}
	
	logicalentity(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
      logicalentity(int id, String name, String location) {
		this.id = id;
		this.name = name;
		this.location = location;
	}
	
	void showInfo() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("location: " + location);
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		logicalentity emp1 = new logicalentity(01);
		logicalentity emp2 = new logicalentity(02, "priya");
		logicalentity emp3 = new logicalentity(03, "riya", "kalyan");
		emp1.showInfo();
		emp2.showInfo();
		emp3.showInfo();
		
	}
}
