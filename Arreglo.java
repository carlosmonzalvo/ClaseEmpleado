/*
Guardar un arreglo en un arreglo
public Arreglo(int []arr2){
	arreglo = arr2;
}

ESTE EJECICIO ES UN ARRREGLO DE DATOS NO ORDENADO QUE PERMITE LA DUBPLICIDA DE INFORMACION
arreglo.leng te regresa el tamaño maximo del arreglo.

Sobre carga de metodos: es cuando tenemos dos metodos iguales pero uno si resive paramateros y el otro no, de esa manera 
el programa puede saber a cual irse cuando le mande un parametro o cuando no le mande parametros NO ENTRARA EN CONFLICTO AUNQUE SE LLAMEN IGUALES.
*/

class Arreglo{
	//ATRUBUTOS
	private int []arreglo;
	private int indice;
	private int dato;
	Ordenamientos arr = new Ordenamientos();

	//CONTRUCTOR
	public Arreglo(int max){
		arreglo = new int [max];
		indice = -1;
		
	}
	//METODOS
	public boolean ValidarEspacio(){
		if( indice < arreglo.length - 1){
			return true;
		}
		else return false;
/*		Validacion
		Leer 
		Insertar*/

	}
	public void Insertar(int dato){
		indice++;
		arreglo[indice] = dato;
	}
	public void Listar(){
		for(int i = 0; i <= indice; i++){
			System.out.println(arreglo[i]);
		}
		System.out.println("\n");
	}
	public int Buscar(int dato){
		for(int i = 0; i<= indice; i++){
			if(arreglo[i] == dato)
				return i; // aqui se romper el ciclo cuando se encuentre
		}
		System.out.println("No existe el dato");
		return -1;
	}
	public void Actualizar(int pos){
		arreglo[pos] = Teclado.LeeEntero("dame nuevos datos: ");
	}
	public int Borrar(int pos){
		int aux = arreglo[pos];
		arreglo[pos] = arreglo[indice];
		indice --;
		return aux;
	}
	public void Listar(int pos){
		System.out.println(arreglo[pos]);
	}
	public void Ordenar(){
		arr.sortIntercambio(arreglo, indice);
	}
}
