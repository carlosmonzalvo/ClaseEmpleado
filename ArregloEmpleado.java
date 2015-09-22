
//Para DIMENSIONAR un se utiliza [] pero si deseo mandar a llamar a un METODO utilizo ()

class ArregloEmpleado{

	//ATRIBUTOS
	private Empleado []arreglo;
	private int indice;

	//CONSRUCTORES
	public ArregloEmpleado(int max){
		arreglo = new Empleado[max];
		indice = -1;
	}
	
	//METODOS
	public boolean ValidaEspacio(){
		return (indice < arreglo.length-1);
	}
	
	public void Insertar(Empleado dato) {
		arreglo[++indice]=dato;
	}

	public void Listar() {
		for (int i=0; i<=indice; i++)
			arreglo[i].Listar();

	   System.out.println();
	}

	public void Listar(int pos) {
		arreglo[pos].Listar();
	}


	public int Buscar(int dato){
		for(int i=0; i<=indice; i++)
			if (dato== arreglo[i].GetClave())
				return i;
		System.out.println("Error: no existe el dato...");
		return -1;
	}
	public void Actualizar(int pos) {
		arreglo[pos].Actualizar();
	}
	public Empleado Borrar(int pos){
		Empleado aux = arreglo[pos];
		arreglo[pos] = arreglo[indice];
		indice--;
		return aux;
	}
	public void Ordenar(){
		//Como invocar el metodo ordenar desde el main
		//como implementaste el metodo ordenar el la clase arreglo empleados
		//Ordenar por seleccion (modificar el metodo de ordenamientos)

		//Se van a ordenar por clave de empleado
		//ya no va a ser un arreglo de enteros si no arrego de empleados
		//cambiar valor de aux
		//if(v[].GetClave > v[].GetClave){....}

	}
	public  int GetIndice(){
		return indice;
	}


}