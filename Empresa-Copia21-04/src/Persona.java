
public abstract class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	
	/**
	 * Constructor por defecto de la clase persona
	 */
	public Persona(){
		this.nombre = null;
		this.apellido = null;
		this.edad = 0;
	}
	
	
	/**
	 * Constructor parametrizado de la clase persona.
	 * 
	 * @param nombre Nombre de la nueva persona
	 * @param apellido Apellido de la nueva persona
	 * @param edad Edad de la nueva persona
	 */
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	
	/**
	 * Constructor de copias de la clase persona.
	 * 
	 * @param p Persona que copiaremos
	 */
	public Persona(Persona p){
		this(p.getNombre(), p.getApellido(), p.getEdad());
	}
	
	
	/**
	 * Metodo para consultar el nombre de la persona.
	 * 
	 * @return Devuelve el nombre de la persona como un String
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Metodo para modificar el nombre de una persona
	 * 
	 * 
	 * @param nombre Nuevo nombre de la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Metodo para consultar el apellido de la persona.
	 * 
	 * @return Devuelve el apellido de la persona como un String
	 */
	public String getApellido() {
		return apellido;
	}
	
	/**
	 * Metodo para modificar el apellido de una persona
	 * 
	 * 
	 * @param apellido Nuevo apellido de la persona
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	/**
	 * Metodo para consultar la edad de la persona.
	 * 
	 * @return Devuelve el edad de la persona como un entero
	 */
	public int getEdad() {
		return edad;
	}
	
	
	/**
	 * Metodo para modificar la edad de una persona
	 * 
	 * 
	 * @param edad Nuev edad de la persona
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString(){
		StringBuilder s = new StringBuilder();
	
		s.append("Nombre: ").append(this.nombre).append(" ").append(this.apellido)
		.append("\t Edad: ").append(this.edad);
		
		return s.toString();
		
		
		
	}
}
