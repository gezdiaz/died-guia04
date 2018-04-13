package died.guia04.ejercicio04;

public class App {

	public static void main(String[] args) {
		
		int anchos[] = {2,1,4,6,3,5};
		PilaPanqueques pila = new PilaPanqueques(6,anchos);
		
		System.out.println("Pila de panqueques sin ordenar:");
		pila.imprimir();
		pila.ordenar();
		System.out.println();
		System.out.println("Pila de panqueques ordenada:");
		pila.imprimir();

	}

}
