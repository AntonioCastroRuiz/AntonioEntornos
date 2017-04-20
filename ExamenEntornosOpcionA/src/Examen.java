
public class Examen {
	
	/**
	 * Metodo que realiza la ordenacion de tres numeros reales de menor a mayor.
	 * 
	 * @return Devuelve los numeros ordenados como un String en el que los numeros van separados por un espacio en blanco.
	 */
	public static String ordenaMenorMayor(double num1, double num2, double num3){
		
		StringBuilder salida = new StringBuilder();
		
		
		if(num1 > num2){
			if(num1<num3){
				salida.append(num2).append(" ").append(num1).append(" ").append(num3);
			}else{
				if(num2 > num3){
					salida.append(num3).append(" ").append(num2).append(" ").append(num1);
				}else{
					salida.append(num2).append(" ").append(num3).append(" ").append(num1);
				}
				
			}
		}else{ // Aqui se cumple m1 < m2
			if(num2 < num3){				
				salida.append(num1).append(" ").append(num2).append(" ").append(num3);			
			}else if(num3 < num1 ){
				salida.append(num3).append(" ").append(num1).append(" ").append(num2);						
			}else{
				salida.append(num1).append(" ").append(num3).append(" ").append(num2);						
			}
		}
		
		
		return salida.toString();
	}
}
