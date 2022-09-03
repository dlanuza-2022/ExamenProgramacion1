package dol;

import misc.ExceptionScanner;

public class BytesToKilobytes implements ITool {
	ExceptionScanner es = new ExceptionScanner();
	
	private double bytes;
	private double kilobytes;
	
	public BytesToKilobytes() {
		super();
	}

	public BytesToKilobytes(double bytes, double kilobytes) {
		super();
		this.bytes = bytes;
		this.kilobytes = kilobytes;
	}

	public double getBytes() {
		return bytes;
	}

	public void setBytes(double bytes) {
		this.bytes = bytes;
	}

	public double getKilobytes() {
		return kilobytes;
	}

	public void setKilobytes(double kilobytes) {
		this.kilobytes = kilobytes;
	}

	@Override
	public void function() {
		System.out.println("______________________________________\n");
		System.out.println("===Convertidor de bytes a kilobytes===");
		System.out.println("______________________________________\n");
		
		System.out.print("==Valor de los bytes==\n");
		
		
		setBytes(es.validDouble());
		
		
		setKilobytes(getBytes()/1000);
		
		
	}

	@Override
	public void showResult() {
		
		System.out.printf("%fbytes equivalen a %fkilobytes", getBytes(), getKilobytes());
		
		
	}
	
	
	
	
	

}
