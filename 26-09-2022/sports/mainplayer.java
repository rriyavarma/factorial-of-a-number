package sports;

public class mainplayer {


	public static void main(String[] args) {
		player p = new player();
		p.jersey();
		
		p = new cricketer();                                  // upcasting
		p.jersey();
		
		if (p instanceof cricketer) {
			((cricketer) p).bat();                          // downcasting
			((cricketer) p).ball();
		}
		
		p = new footballer();                                 // upcasting
		p.jersey();
		
		if (p instanceof footballer) {
			((footballer) p).goal();                       // downcasting
			((footballer) p).defence();	
		}
	}

}
