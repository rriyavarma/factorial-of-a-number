package sports;

public class footballer extends player {
	

	public void goal() {
		System.out.println("Goal");
	}
	
	public void defence() {
		System.out.println("Defencing");
	}
	
	@Override
	public void stadium() {
		System.out.println("stadium - Bangalore Football Stadium");
	}
	
	@Override
	public void jersey() {
		System.out.println("Red jersey for footballer");
	}
}
