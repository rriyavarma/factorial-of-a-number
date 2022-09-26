package sports;

public class cricketer extends player {

	public void bat() {
		System.out.println("Batting");
	}
	
	public void ball() {
		System.out.println("Balling");
	}
	
	@Override
	public void stadium() {
		System.out.println("Stadium - Wankhede Stadium Stadium");
	}
	
	@Override
	public void jersey() {
		System.out.println("Blue jersey for cricketer");
	}
}
