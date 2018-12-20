package prereq;

public class enumc1 {
	 public static void main(String[] args) {
	 
		 System.out.println(ticketstatus.OPEN);
		 System.out.println(ticketstatus.CLOSED);
		 System.out.println(enumc2.ADD.calculate(1, 2));
		 
		 
		 for (ticketstatus status : ticketstatus.values()) {
	            System.out.println(status);
	        }
		 
		 
	 }
	 
	 /*A Java Enum is a special Java type used to define collections of constants. More precisely, a Java enum type is a special kind of Java class. An enum can contain constants, methods etc. 
	  * Notice the enum keyword which is used in place of class or interface. The Java enum keyword signals to the Java compiler that this type definition is an enum.
	  * 
	  * 
	  */
}
