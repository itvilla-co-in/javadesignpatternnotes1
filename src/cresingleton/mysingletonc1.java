package cresingleton;

public class mysingletonc1 {
	
	String member1;
	String member2;
	
	private mysingletonc1() {
		this.member1 = "this value is shared across all instances";
		this.member2 = "Second value across all instances";
		System.out.println("When am i called");
		
	}

	private static final mysingletonc1 INSTANCE = new mysingletonc1();
	
	public static mysingletonc1 getInstance() {
		return INSTANCE;
	}
}
