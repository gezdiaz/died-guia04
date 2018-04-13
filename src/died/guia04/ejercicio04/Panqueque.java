package died.guia04.ejercicio04;

public class Panqueque {
	
	Integer ancho;
	
	public Panqueque(Integer ancho){
		this.ancho = ancho;
	}
	
	public Integer getAncho() {
		return this.ancho;
	}
	
	public Boolean esMasAncho(Panqueque p) {
		return this.ancho > p.getAncho();
	}

	@Override
	public String toString() {

		return "Ancho panqueque: "+ancho.toString();
		
	}
	
	
	
}
