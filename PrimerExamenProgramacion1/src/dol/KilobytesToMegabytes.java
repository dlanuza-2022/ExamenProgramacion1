package dol;

import misc.ExceptionScanner;

public class KilobytesToMegabytes implements ITool {
	ExceptionScanner es = new ExceptionScanner();
	private double kilobytes;
	private double megabytes;
	
	
	
	public KilobytesToMegabytes() {
		super();
	}

	public KilobytesToMegabytes(double kilobytes, double megabytes) {
		super();
		this.kilobytes = kilobytes;
		this.megabytes = megabytes;
	}

	public double getKilobytes() {
		return kilobytes;
	}

	public void setKilobytes(double kilobytes) {
		this.kilobytes = kilobytes;
	}

	public double getMegabytes() {
		return megabytes;
	}

	public void setMegabytes(double megabytes) {
		this.megabytes = megabytes;
	}

	@Override
	public void function() {
		
		System.out.println("_______________________________________\n");
		System.out.println("===Convertidor de kilobytes a megabytes===");
		System.out.println("_______________________________________\n");
		
		System.out.print("==Valor de los kilobytes==\n");
		
		
		setKilobytes(es.validDouble());
		
		
		setMegabytes(getKilobytes()/1024);
		
		
	}

	@Override
	public void showResult() {
		System.out.printf("%fkilobytes equivalen a %fmegabytes", getKilobytes(), getMegabytes());
		
	}
	
	
	
	
	
	

}
