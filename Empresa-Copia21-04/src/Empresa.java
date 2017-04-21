import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 * @author Nono
 * @since 21/04/2017
 */
public class Empresa {
	String nombre;
	ArrayList <Cliente> mis_clientes;
	ArrayList <Departamento> departamentos;
	ArrayList <Empleado> empleados;

	/**
	 * 
	 * Constructor de la clase empresa.
	 * 
	 * @param n nombre de la empresa
	 */
	public Empresa(String n){
		this.nombre=n;

		this.mis_clientes = new ArrayList<Cliente>();
		this.departamentos = new ArrayList<Departamento>();
		this.empleados = new ArrayList<Empleado>();
	}


	
	/**
	 * Menu principal de la aplicacion
	 */
	public void menu_principal(){
		Scanner in = new Scanner(System.in);
		int opcion =0;
		do{
			System.out.println("---------- Menu Principal ---------- \n");
			System.out.println("1. Menu departamento. \n");
			System.out.println("2. Menu Empleado. \n");
			System.out.println("0. Salir. \n");
			System.out.println("------------------------------------ \n");

			System.out.print("Introduzca una opcion: ");
			opcion = in.nextInt();

			switch(opcion){
			case 1: 
				this.menu_departamento();
				break;

			case 2:
				this.menu_empleado();
				break;
			case 0:
				break;

			default:
				System.out.println("Introduzca una opcion correcta....");
				break;
			}



		}while(opcion!=0);

		in.close();
	}


	/**
	 * Menu de acciones referentes a los empleados
	 */
	private void menu_empleado(){


		Scanner in = new Scanner(System.in);
		int opcion = 0;


		do{

			System.out.println("---------- Menu Empleado ---------- \n");
			System.out.println("1. Contratar empleado. \n");
			System.out.println("2. Despedir empleado. \n");
			System.out.println("3. Añadir empleado a departamento. \n");
			System.out.println("4. Convertir empleado en jefe de departamento. \n");
			System.out.println("5. Buscar empleado. \n");			
			System.out.println("6. Ver empleados \n");			
			System.out.println("0. Vover. \n");
			System.out.println("----------------------------------- \n");


			System.out.print("Introduzca una opcion: ");
			opcion = in.nextInt();

			switch(opcion){
			case 1: 
				this.contratar_empleado();
				break;
				
			case 6:
				this.mostrar_empleados();
				
			case 0:
				break;


			default:
				System.out.println("Introduzca una opcion correcta....");
				break;
			}



		}while(opcion!=0);

		
	}
	
	
	/**
	 * Menu de las acciones references a los departamentos
	 */
	private void menu_departamento(){


		Scanner in = new Scanner(System.in);
		int opcion = 0;


		do{

			System.out.println("---------- Menu Departamento ---------- \n");
			System.out.println("1. Crear Departamento. \n");
			System.out.println("2. Disolver Departamento. \n");
			System.out.println("3. Asignar jefe. \n");
			System.out.println("4. Buscar departamento. \n");
			System.out.println("5. Buscar empleado. \n");
			System.out.println("6. Ver departamento. \n");
			System.out.println("0. Volver. \n");
			System.out.println("----------------------------------- \n");


			System.out.print("Introduzca una opcion: ");
			opcion = in.nextInt();

			switch(opcion){
			case 1: 
				this.añadir_departamento();
				break;
				
			case 0:
				break;


			default:
				System.out.println("Introduzca una opcion correcta....");
				break;
			}



		}while(opcion!=0);

		
	}



	/**
	 * Metodo para añadir un departamento a la empresa
	 */
	private void añadir_departamento(String nombre) {
		if(this.get_departamento(nombre)==null){
			this.departamentos.add(new Departamento(nombre));
		}else{
			System.out.println("El departamento " + nombre + "ya existe");
		}

	}
	
	
	
	

	/**
	 * Metodo para añadir un departamento a la empresa
	 */
	private void añadir_departamento() {
		String nombre;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Introduzca el nombre del departamento: ");
		nombre = in.nextLine();
		
		
		
		if(this.get_departamento(nombre)==null){
			this.departamentos.add(new Departamento(nombre));
		}else{
			System.out.println("El departamento " + nombre + "ya existe");
		}

	}

	
	
	
	
	
	
	
	

	/**
	 * Metodo para contratar un empleado
	 */
	private void contratar_empleado() {
		String opcion="n";
		Scanner in = new Scanner(System.in);
		String nombre;
		String apellido;
		int edad=0;
		double sueldo=0;
		String depar;
		Empleado e;
		Departamento d;

		
		System.out.print("Introduzca el nombre de su departamento: ");		
		depar = in.nextLine();
		System.out.print("Introduzca el nombre del empleado: ");		
		nombre = in.nextLine();
		System.out.print("Introduzca el apellido del empleado: ");		
		apellido = in.nextLine();
		System.out.print("Introduzca el edad del empleado: ");		
		edad = in.nextInt();
		in.nextLine();
		System.out.print("Introduzca el sueldo del empleado: ");		
		sueldo = in.nextDouble();
		in.nextLine();

		


	
		d = this.get_departamento(depar);
		if(d!=null){
			e = new Empleado(nombre, apellido, edad, sueldo, depar);
			this.empleados.add(e);
			d.añadir_empleado(e);
			System.out.println("Empleado añadido al departamento " + d.getNombre());
		}else{
			System.out.println("No existe tal departamento...");
			System.out.print("¿Desea crearlo? s/n :   ");
			
			opcion = in.nextLine();
			if(opcion.equals("s")){
				d=new Departamento(depar);
				this.departamentos.add(d);
				e = new Empleado(nombre, apellido, edad, sueldo, depar);
				this.empleados.add(e);
				d.añadir_empleado(e);
				System.out.println("Empleado añadido al departamento " + d.getNombre());
			}else{
				System.out.println("No se ha añadido el empleado");
			}
		}


	}
	
	
	
	
	
	
	
	
	
	
	

	/**
	 * Busca un departamento por id.
	 * 
	 * 
	 * @param id El id del departamento a buscar
	 * @return Devuelve el departamento si lo encuentra, en caso contrario devuelve null
	 * 
	 * @see get_departamento(String nombre) : Departamento
	 */
	public Departamento get_departameto(int id){
		Departamento d;
		Departamento resultado =null;
		for(int i=0; i<this.departamentos.size(); i++){

			d = this.departamentos.get(i);

			if(id == d.getId_departamento()){
				resultado = d;
				break;
			}
		}

		return resultado;
	}
	
	
	
	
	
	
	
	
	
	/**
	 * Busca un departamento por nombre.
	 * 
	 * 
	 * @param nombre El nombre del departamento a buscar
	 * @return Devuelve el departamento si lo encuentra, en caso contrario devuelve null
	 */
	public Departamento get_departamento(String nombre){
		
		
		//Con iterador 
		
		/*
		Departamento d, resultado;
		resultado = null;
		Iterator it = this.departamentos.listIterator();
		
		while(it.hasNext()){
			d = (Departamento)it.next();
			
			if(nombre.equals(d.getNombre())){
				resultado = d;
			}
		}
		
		return resultado
		
		*/
		
		
		//Con un foreach
		Departamento resultado = null;
		
		for(Departamento d:this.departamentos){
			if(nombre.equals(d.getNombre())){
				resultado = d;
			}
		}
		
		return resultado;
	}
	
	
	
	
	
	
	/**
	 * Metodo que muestra los empleados de la empresa
	 */
	private void mostrar_empleados(){
		System.out.println("\n\n\n\n");
		for(Empleado e:this.empleados){
			System.out.println(e);
		}
		System.out.println("\n\n\n\n");
	}


}
