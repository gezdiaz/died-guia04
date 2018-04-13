package died.guia04.ejercicio02;

public class Temperatura {
	
	private Double grados;
	private Escala escala;
	
	public Temperatura() {
		grados = 0.0;
		escala = Escala.CELCIUS;
	}
	
	public Temperatura(Double temperatura, Escala escala) {
		this.grados = temperatura;
		this.escala = escala;
	}	
	
	@Override
	public String toString() {
		String aux;
		aux = this.grados.toString();
		switch(this.escala) {
		case CELCIUS: 
			aux = aux + " Cº";
			break;
		case FAHRENHEIT:
			aux = aux + " Fº";
			break;
		}
		return aux;
	}
	
	public Double asCelcius() {
		switch(this.escala) {
		case CELCIUS:
			return this.grados;
		case FAHRENHEIT:
			return (grados-32.0)*(5.0/9.0);
		default: return 0.0;
		}
	}
	
	public Double asFahrenheit() {
		switch(this.escala) {
		case CELCIUS:
			return (grados*(9.0/5.0))+32.0;
		case FAHRENHEIT:
			return this.grados;
		default: return 0.0;
		}
	}
	
	public void aumentar(Temperatura temperatura) {
		switch(this.escala) {
		case CELCIUS:
			if(temperatura.asCelcius() > 0.0)
				this.grados = this.grados + temperatura.asCelcius();
			break;
		case FAHRENHEIT:
			if(temperatura.asFahrenheit() > 0.0)
				this.grados = this.grados + temperatura.asFahrenheit();
			break;
		}
	}
	
	public void disminuir(Temperatura temperatura) {
		switch(this.escala) {
		case CELCIUS:
			if(temperatura.asCelcius() > 0.0)
				this.grados = this.grados - temperatura.asCelcius();
			break;
		case FAHRENHEIT:
			if(temperatura.asFahrenheit() > 0.0)
				this.grados = this.grados - temperatura.asFahrenheit();
			break;
		}
	}
	
	public Boolean esMayorQue(Temperatura otraTemperatura) {
		switch(this.escala) {
		case CELCIUS:
			return this.grados > otraTemperatura.asCelcius();
		case FAHRENHEIT:
			return this.grados > otraTemperatura.asFahrenheit();
		}
		return false;
	}
	
}
