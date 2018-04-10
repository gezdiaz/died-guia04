package died.guia04.ejercicio01;

public class Recta {
	
	private Punto A, B;
	
	public Recta() {
		A.setX(1);
		A.setY(1);
		B.setX(2);
		B.setY(2);
	}
	public Recta(Punto P1, Punto P2){
		A = P1;
		B = P2;
	}
	public Punto getA() {
		return A;
	}
	public Punto getB() {
		return B;
	}
	public float pendiente() {
		float x0, y0, x1, y1;
		x0 = A.getX();
		y0 = A.getY();
		x1 = B.getX();
		y1 = B.getY();
		return (y1-y0)/(x1-x0);
	}
	public boolean paralelas(Recta otraRecta) {
		return this.pendiente() == otraRecta.pendiente();
	}
	public boolean equals(Object otraRecta) {
		Recta aux;
		if(otraRecta.getClass() == this.getClass()) {
			if(this.pendiente() == ((Recta) otraRecta).pendiente()) {
				if (this.A == ((Recta) otraRecta).getA()) {
					aux = new Recta(this.A, ((Recta) otraRecta).getB());
					return this.pendiente() == aux.pendiente();
				}else {
					aux = new Recta(this.A, ((Recta) otraRecta).getA());
					return this.pendiente() == aux.pendiente();
				}
			}
		}
		return false;
	}
}
