
public class Cliente extends Persona{

	private String telefono_de_contacto;

	
	/**
	 * Constructor de la clase Cliente
	 * 
	 * @param nombre Nombre del cliente
	 * @param apellido Apellido del cliente
	 * @param edad Edad del cliente
	 * @param telefono_de_contacto Telefono del cliente
	 */
	public Cliente(String nombre, String apellido, int edad, String telefono_de_contacto) {
		super(nombre, apellido, edad);
		this.telefono_de_contacto = telefono_de_contacto;
	}

	
	/**
	 * Metodo para consultar el telefono de un cliente.
	 * 
	 * 
	 * @return Devuelve el telefono de un cliente como un String.
	 */
	public String getTelefono_de_contacto() {
		return telefono_de_contacto;
	}

	
	/**
	 * Metodo para modificar el telefono de un cliente.
	 * 
	 * 
	 * @param telefono_de_contacto Telefono asignar al cliente
	 */
	public void setTelefono_de_contacto(String telefono_de_contacto) {
		this.telefono_de_contacto = telefono_de_contacto;
	}

	@Override
	public String toString(){
		StringBuilder s = new StringBuilder();

		s.append(super.toString()).append("\t Telefono de contacto: ").append(this.telefono_de_contacto);

		return s.toString();
	}


}
