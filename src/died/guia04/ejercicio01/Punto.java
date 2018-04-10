package died.guia04.ejercicio01;

public class Punto {
	
	private float x, y;
	
	public Punto(float abs, float ord) {
		this.x = abs;
		this.y = ord;
	}
	public Punto() {}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	
	public boolean equals(Object otroPunto) {
		if(otroPunto.getClass() == this.getClass()) {
			if(this.x == ((Punto) otroPunto).getX() && this.y == ((Punto) otroPunto).getY()) {
				return true;
			}
		}
		return false;
	}

}
