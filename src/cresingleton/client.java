package cresingleton;

public class client {

	public static void main(String[] args) {
		
		mysingletonc1 singleton;
		System.out.println("Am i called before instance");
		singleton = mysingletonc1.getInstance();
		System.out.println("Am i called after method call instance");

		System.out.println("memeber 1 value " + singleton.member1);
		
		
		mysingletonc1 singleton2;
		singleton2 = mysingletonc1.getInstance();
		System.out.println("memeber 1 value " + singleton.member1);
		
		System.out.println("************* LAZY *************");
		mylazysingleton lazyobject = mylazysingleton.getInstance();
		 
	}

}

