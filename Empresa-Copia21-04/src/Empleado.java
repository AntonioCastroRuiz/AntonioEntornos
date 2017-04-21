
public class Empleado extends Persona{
	private double sueldo_bruto;
	private String departamento;

	
	/**
	 * Constructor de la clase Empleado
	 * 
	 * @param nombre Nombre del empleado.
	 * @param apellido Apellido del empleado.
	 * @param edad Edad del empleado.
	 * @param sueldo_bruto Salario bruto del empleado.
	 * @param departamento Nombre del departamento del empleado.
	 */
	public Empleado(String nombre, String apellido, int edad, double sueldo_bruto, String departamento) {
		super(nombre, apellido, edad);
		this.sueldo_bruto = sueldo_bruto;
		this.departamento = departamento;
	}

	
	/**
	 * Metodo para consultar el sueldo del empleado.
	 * 
	 * @return Devuelve un double con el salario del empleado.
	 */
	public double getSueldo_bruto() {
		return sueldo_bruto;
	}

	
	/**
	 * Metodo para establecer el sueldo del empleado.
	 * 
	 * @param sueldo_bruto Salario a establecer para el empleado.
	 */
	public void setSueldo_bruto(double sueldo_bruto) {
		this.sueldo_bruto = sueldo_bruto;
	}
	
	@Override
	public String toString(){
		StringBuilder s = new StringBuilder();
		
		s.append(super.toString()).append("\t Salario: ").append(this.calcular_salario_neto()).append("\t Departamento: ").append(this.departamento);
		
		return s.toString();
	}
	
	public double calcular_salario_neto(){
		return this.sueldo_bruto*0.80;
	}

	
	
}
