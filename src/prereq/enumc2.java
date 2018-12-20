package prereq;

public enum enumc2 {
	
	 ADD,
	    SUB,
	    MUL,
	    DIVIDE;

	    double calculate(double x, double y) {
	        switch (this) {
	            case ADD:
	                return x + y;
	            case SUB:
	                return x - y;
	            case MUL:
	                return x * y;
	            case DIVIDE:
	                return x / y;
	            default:
	                throw new AssertionError(" Operation not defined " + this);
	        }
	    }
	    

}
