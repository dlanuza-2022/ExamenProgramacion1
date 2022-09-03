package misc;

import java.util.Scanner;

public class ExceptionScanner {
      Scanner sc = new Scanner(System.in);
	
	
	

	   public double validDouble() {
		   
		   
		   double value;
		   
		   do {
			   System.out.print("Ingrese el valor: ");
			   value = sc.nextDouble();
			   
			   if(value < 0) {
				   System.out.println("El valor no puede ser menor a 0.");
			   }
			   
			   
		   }while(value < 0);
		   
		   return value;
		   
		   
		 }
	
	

}
