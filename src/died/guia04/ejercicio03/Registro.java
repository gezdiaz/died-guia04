package died.guia04.ejercicio03;

import died.guia04.ejercicio02.Escala;
import died.guia04.ejercicio02.Temperatura;

public class Registro {
	
	private String ciudad;
	private Temperatura[] historico; 
	private Integer cantidadMuestras;
	
	public Registro() {
		this.ciudad = "-";
		this.historico = new Temperatura[30];
		cantidadMuestras = 0;
	}
	
	public Registro(String ciudad) {
		this.ciudad = ciudad;
		this.historico = new Temperatura[30];
		cantidadMuestras = 0;
	}
	
	public String getCiudad() {
		return this.ciudad;
	}
	
	public void imprimir() {
		System.out.println("Tempraturas Registradas en: "+this.ciudad+":");
		for(int i=0; i<this.cantidadMuestras; i++) {
			System.out.println("\t"+(i+1)+") "+historico[i].toString());
		}
	}
	
	public void agregar(Temperatura t) {
		if(cantidadMuestras < historico.length) {
			historico[cantidadMuestras] = t;
			cantidadMuestras++;
		}
	}
	
	public Temperatura mediaAsCelcius() {
		Double sum = 0.0;
		if(cantidadMuestras != 0)
			for(int i=0; i < cantidadMuestras; i++) {
				sum += historico[i].asCelcius();
			}
		return new Temperatura(sum/cantidadMuestras,Escala.CELCIUS);
	}
	
	public Temperatura mediaAsFahrenheit() {
		Double sum = 0.0;
		if(cantidadMuestras != 0)
			for(int i=0; i < cantidadMuestras; i++) {
				sum += historico[i].asFahrenheit();
			}
		return new Temperatura(sum/cantidadMuestras,Escala.FAHRENHEIT);
	}
	
	public Temperatura maximo() {
		return maximo(this.historico, 0, this.cantidadMuestras-1);
	}
	
	private Temperatura maximo(Temperatura[] vector, int i, int f) {
		Temperatura aux1, aux2;
		int med;
		if(i == f) {
			return vector[i];
		}else {
			med = (i+f)/2;
			aux1 = maximo(vector, i, med);
			aux2 = maximo(vector, med+1, f);
			if(aux1.esMayorQue(aux2))
				return aux1;
			else
				return aux2;
		}
		
	}
	
}
