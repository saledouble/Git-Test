package p;

import java.util.logging.Level;
import java.util.logging.Logger;

public class A {
	public void n0() {
		Logger.getGlobal().log(Level.INFO, "hi, n0");
	}
	
	public static void n1() {
		Logger.getGlobal().info("hi, n1");
	}
}
