package died.guia04.ejercicio03;

import java.util.Random;

import died.guia04.ejercicio02.Escala;
import died.guia04.ejercicio02.Temperatura;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Registro r1 = new Registro("DENVER");
		Registro r2 = new Registro("NAIROBI");
		Random generadorAleatorio = new Random();
		
		for(int i=0;i<10;i++) {
			r1.agregar(new Temperatura(generadorAleatorio.nextDouble()*50,Escala.CELCIUS));
		}
		
		for(int i=0;i<10;i++) {
			r2.agregar(new Temperatura(generadorAleatorio.nextDouble()*105,Escala.FAHRENHEIT));
		}
		
		r1.imprimir();
		System.out.println("Promedio en "+r1.getCiudad()+" :"+r1.mediaAsCelcius());
		System.out.println("Maximo en "+r1.getCiudad()+" :"+r1.maximo().asCelcius() +" C�");
		r2.imprimir();
		System.out.println("Promedio en "+r2.getCiudad()+" :"+r2.mediaAsFahrenheit());
		System.out.println("Maximo en "+r2.getCiudad()+" :"+r2.maximo().asFahrenheit() +" F�");
	}

}
