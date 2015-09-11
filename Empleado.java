class Empleado{
	//ATRIBUTOS
	private int clave;
	private String nom;
	private String genero;
	private Arreglo sueldo; //ArregloReal
	private Arreglo tels;
	private Direccion dir;

	//CONSTRUCTORES
	public Empleado(int max_s, int max_t){
		sueldo = new Arreglo(max_s); // Se crea al objeto, no estoy dimensionando el arreglo.
		tels = new Arreglo (max_t); // se crea el objeto
		dir = new Direccion(); //Se crea el objeto
	}
	//METODOS
	public void CapturaEmpleado(){
		LeeClave();
		LeeNom();
		LeeGenero();
		CapturaSueldos();
		dir.CapturaDireccion();
	}
	public void LeeClave(){
		clave = Teclado.LeeEntero("Clave: ");
	}
	public void LeeNom(){
		nom = Teclado.LeeCadena("Nombre: ");
	}
	public void LeeGenero(){
		genero = Teclado.LeeCadena("Genero: ");
	}
	public void CapturaTels(){
		int dato;
		if (tels.ValidarEspacio()){
					dato = Teclado.LeeEntero("Dame numero: ");
					tels.Insertar(dato);
					//tambien se puede escribir en una sola linea y seria ( miarreglo.Insertar(Teclado.entero("Dame numero: ")); )

				}
				else
					System.out.println("No existe espacio en el arreglo");
	}
		public void CapturaSueldos(){
		int dato;
		if (sueldo.ValidarEspacio()){
					dato = Teclado.LeeEntero("Dame numero: ");
					sueldo.Insertar(dato);
					//tambien se puede escribir en una sola linea y seria ( miarreglo.Insertar(Teclado.entero("Dame numero: ")); )

				}
				else
					System.out.println("No existe espacio en el arreglo");
	}

	public void Listar(){
			System.out.println(clave + "\n"+ nom+ "\t" + genero+ "\t");
			sueldo.Listar();
			tels.Listar();
			dir.Listar();
		
	}

	public void Actualizar(){
		int opcion;
		Menu menu = new Menu();

		do{
			opcion = menu.ListaMenu("1)Nombre\n2)Genero\n3)Sueldos\n4)Telefonos\n5)Direccion\n6)Salir", 6);

			switch(opcion){
				case 1: LeeNombre();
						break;
				case 2: LeeGenero();
						break;
				case 3: ActualizaSueldo();
						break;
				case 4: ActualizaTels();
						break;
				case 5: dir.Actualizar();
						break;
			}
		}while(opcion != 6);
	}


	public void ActualizaSueldo(){
		int opcion, dato, pos;
		Menu menu = new Menu();

		do{
			opcion = menu.ListaMenu("1)Insertar\n2)Modificar\n3)Borrar\n4)Salir", 4);

			switch(opcion){
				case 1: CapturaSueldos();
						break;

				case 2: dato = Teclado.LeeEntero("Dame el sueldo del empleado para actualizar: ");
						pos = sueldo.Actualizar(dato);
						if (pos !=-1 )
							sueldo.Actualizar(pos);
						break;

				case 3: dato = Teclado.LeeEntero("Dame el sueldo para borrar: ");
				 	pos = sueldo.Buscar(dato);
					if(pos != -1){
						dato = sueldo.Borrar(pos);
						System.out.println("El dato eliminado es: " + dato);
						}
						break;

			}
		}while(opcion != 6);
	}

	public void ActualizaTels(){
		int opcion, dato, pos;
		Menu menu = new Menu();

		do{
			opcion = menu.ListaMenu("1)Insertar\n2)Modificar\n3)Borrar\n4)Salir", 4);

			switch(opcion){
				case 1: CapturaTels();
						break;

				case 2: dato = Teclado.LeeEntero("Dame el telefono del empleado para actualizar: ");
						pos = tels.Actualizar(dato);
						if (pos !=-1 )
							tels.Actualizar(pos);
						break;

				case 3: dato = Teclado.LeeEntero("Dame el telefono para borrar: ");
				 	pos = tels.Buscar(dato);
					if(pos != -1){
						dato = tels.Borrar(pos);
					System.out.println("El telefono eliminado es: " + dato);
					}
						break;

			}
		}while(opcion != 6);
	}


}