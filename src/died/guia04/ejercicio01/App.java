package died.guia04.ejercicio01;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto P1, P2, P3;
		Recta R1, R2;
		P1 = new Punto(1,1);
		P2 = new Punto(2,2);
		R1 = new Recta(P1,P2);
		System.out.println("La pendiente de la recta R1 es m = "+R1.pendiente());
		P3 = new Punto(3,3);
		R2 = new Recta(P2,P3);
		System.out.println(R1.equals(R2));
		

	}

}
