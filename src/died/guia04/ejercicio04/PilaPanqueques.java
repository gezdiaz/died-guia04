package died.guia04.ejercicio04;

public class PilaPanqueques {
	
	Panqueque pila[];
	Integer cantidad;
	
	public PilaPanqueques(int cant, int anchos[]) {
		pila = new Panqueque[cant];
		for(int i=0; i<cant; i++) {
			pila[i] = new Panqueque(anchos[i]);
		}
		cantidad = cant;
	}
	
	public void ordenar() {
		int cantOrdenados = 1;
		
		for(int h=0; h<cantidad; h++) {
			this.darVuelta(this.mayor(0,cantidad-cantOrdenados));
			this.darVuelta(cantidad-cantOrdenados);
			cantOrdenados++;
		}
		
	}
	
	private void darVuelta(int n) {
		int i=0, j=n;
		while(i<j) {
			this.intercambiar(i,j);
			i++;
			j--;
		}
	}
	
	private void intercambiar(int i, int j) {
		Panqueque aux;
		aux = pila[i];
		pila[i] = pila[j];
		pila[j] =aux;
		
	}

	private int mayor(int i, int f) {
		
		Panqueque may = pila[i];
		int posmay = i;
		
		for(int j=i; j<=f; j++) {
			if(pila[j].esMasAncho(may)) {
				may = pila[j];
				posmay = j;
			}
		}
		return posmay;
	}
	
	public void imprimir() {
		Integer cont = 1;
		for(Panqueque p: pila) {
			if(p != null) System.out.println((cont++).toString()+". "+p.toString());
		}
	}
	
}
