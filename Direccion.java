class Direccion{
	//ATRIBUTOS
	private int numero; 
	private String calle;
	private String colonia;
	private int cp;

	//CONSTRUCTOR
	public void CapturaDireccion(){
		LeeNumero();
		LeeCalle();
		LeeColonia();
		LeeCP();
	}

	//METODOS

	public void LeeNumero(){
		numero = Teclado.LeeEntero("Numero: ");
	}
	public void LeeCalle(){
		calle = Teclado.LeeCadena("Calle: ");
	}
	public void LeeColonia(){
		colonia = Teclado.LeeCadena("Colonia: ");
	}
	public void LeeCP(){
		colonia = Teclado.LeeCadena("CP: ");
	}
	public void Listar(){
		System.out.println(calle + "\t" + numero + "\t" + colonia + "\t" + cp);
	}
	public void Actualizar(){
		int opcion;
		Menu menu= new Menu();
		do{
			opcion = menu.ListaMenu("1)Calle\n2)Numero\n3)Colonia\n4)CP\n5)Salir\nOpcion:", 5);

			switch(opcion){
				case 1: LeeCalle();
						break;
				case 2: LeeNumero();
						break;
				case 3: LeeColonia();
						break;
				case 4: LeeCP();
						break;
			}
		}while(opcion != 5);
	}
}