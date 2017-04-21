import java.util.ArrayList;

public class Departamento {
	/**
	 * Indica el numero de departamentos de la empresa, que utilizaremos como id 
	 * de un nuevo departamento
	 */
	private static int NUMERO_DEPARTAMENTOS= 0;
	private int id_departamento;
	private String nombre;
	
	private ArrayList <Empleado> lista_empleados;
	private Empleado jefe;
	
	
	/**
	 * 
	 * Constructor de la clase departamento
	 * 
	 * @param nombre nombre del nuevo departamento.
	 */
	public Departamento(String nombre) {
		this.id_departamento = NUMERO_DEPARTAMENTOS;
		this.nombre = nombre;
		this.lista_empleados = new ArrayList <Empleado>();
		this.jefe = null;
		NUMERO_DEPARTAMENTOS++;
	}
	
	
	/**
	 * Añade un nuevo empleado al departamento
	 * 
	 * 
	 * @param e Empleado a añadir
	 */
	public void añadir_empleado(Empleado e){
		this.lista_empleados.add(e);
	}

	
	/**
	 * Metodo para consultar la id del departamento
	 * 
	 * @return Devuelve un entero con la id del departamento.
	 */
	public int getId_departamento() {
		return id_departamento;
	}

	
	/**
	 * Metodo para modificar la id del departamento
	 * 
	 * @param id_departamento Id que asignaremos al departamento
	 */
	public void setId_departamento(int id_departamento) {
		this.id_departamento = id_departamento;
	}

	
	/**
	 * Metodo para consultar el nombre del departamento
	 * 
	 * @return Devuelve una cadena con el nombre del departamento
	 */
	public String getNombre() {
		return nombre;
	}

	
	/**
	 * Metodo para modificar el nombre del departamento.
	 * 
	 * 
	 * @param nombre Nombre que asignaremos al departamento
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	/**
	 * Metodo para consultar el jefe del departamento.
	 * 
	 * @return Devuelve el Empleado jefe del departamento
	 */
	public Empleado getJefe() {
		return jefe;
	}

	
	/**
	 * Metodo para establecer el jefe de un departamento
	 * 
	 * @param jefe Empleado que estableceremos como jefe del departamento
	 */
	public void setJefe(Empleado jefe) {
		this.jefe = jefe;
	}
	
	
	
	
}
