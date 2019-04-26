package p;

import java.util.logging.Level;
import java.util.logging.Logger;

public class A {
	public void n0() {
		Logger.getGlobal().log(Level.INFO, "hi, n0");
	}
	
	public static void n2() {
		Logger.getGlobal().info("hi, n1");
	}
	
	public static void n1() {
		Logger LOGGER = Logger.getGlobal();
		boolean isClosed = true;
		
		if (isClosed) 
			LOGGER.log(Level.FINEST, "incoming {0}");
		
		if (LOGGER.isLoggable(Level.FINER))
			LOGGER.log(Level.FINEST, "incoming {0}");	
		
		if (LOGGER.isLoggable(Level.FINE)) 
			LOGGER.log(Level.SEVERE, "{0}");
	}
}
