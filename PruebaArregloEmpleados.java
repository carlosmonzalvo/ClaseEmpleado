class PruebaArregloEmpleados{
	
	public static void main(String []args){
		//variables locales
		int dato, pos, max, max_s, max_t, opcion;
		ArregloEmpleado miarreglo;//aqui se declara la variable de tipo arreglo
		Menu menu = new Menu();
		Empleado obj, obj2;
		Estadisticas e;
		
		
		max = Teclado.LeeEntero("Dame el tamaño del arreglo: ");
		miarreglo= new ArregloEmpleado(max); //aqui se crea el objeto Arreglo
		max_s = Teclado.LeeEntero("Dame el num de sueldos maximo por empleado:");
		max_t = Teclado.LeeEntero("Dame el num de telefonos maximo por empleado: ");
		e = new Estadisticas(miarreglo);

		do {
			opcion = menu.ListaMenu(".....",7);
			switch (opcion) {
				case 1: if (miarreglo.ValidaEspacio()){
								obj = new Empleado(max_s, max_t);
								obj.CapturaEmpleado();
								miarreglo.Insertar(obj);
							}
							else
								System.out.println("No existe espacio en el arreglo...");
						break;
				case 2: miarreglo.Listar();			
						break;
						
			    case 3: dato = Teclado.LeeEntero("Dame la clave del empleado actualizar: ");
						  pos = miarreglo.Buscar(dato);
						  if (pos !=-1)
						  		miarreglo.Actualizar(pos);
						break;	
			    case 4: dato = Teclado.LeeEntero("Dame la clave del empleado: ");
						  pos = miarreglo.Buscar(dato);
						  if (pos !=-1)
						  		miarreglo.Listar(pos);
						break;
				case 5: dato = Teclado.LeeEntero("Dame la clave del empleado borrar: ");
						  pos = miarreglo.Buscar(dato);
						  if (pos !=-1){
						  		obj2 = miarreglo.Borrar(pos);
								System.out.println("Borrado...");
								}
						break;
			    case 6:  //ordenar
						break;

				case 7: //estadisctica
						break;

			}
		}while (opcion != 7);


	}
}