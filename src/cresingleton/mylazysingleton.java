package cresingleton;

public class mylazysingleton {

    private mylazysingleton() {
    	
    }
    
    private static volatile mylazysingleton INSTANCE;
    
    public static mylazysingleton getInstance() {
    	if(INSTANCE == null) {
    		synchronized (mylazysingleton.class) {
				if(INSTANCE == null) {
					INSTANCE = new mylazysingleton();				
				}
			}
    	}
    	return INSTANCE;
    }
}

