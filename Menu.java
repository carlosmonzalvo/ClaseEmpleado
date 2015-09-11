class Menu {

	public int ListaMenu(String texto, int opc_max){ // Le pasamos parametros para que no siempre se mande el mismo texto y para que 
		int opcion; // Cada submenu tenga su numero de opcion maxima.
		do{
		opcion = Teclado.LeeEntero(texto);
		if (opcion > opc_max || opcion < 1)
			System.out.println("Error: opcion no valida... ");
		}while(opcion > opc_max || opcion<1);

		return opcion;

	}
}