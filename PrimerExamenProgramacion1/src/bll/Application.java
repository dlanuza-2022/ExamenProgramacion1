package bll;

import dol.BytesToKilobytes;
import dol.KilobytesToMegabytes;

public class Application {
	static BytesToKilobytes bk = new BytesToKilobytes();
	static KilobytesToMegabytes km = new KilobytesToMegabytes();
	
	
	public static void bytesToKilobytes() {
		
		bk.function();
		bk.showResult();
		
	}
	
	public static void kilobytesToMegabytes(){
		
		km.function();
		km.showResult();
		
	}
	
	
	
	

}
