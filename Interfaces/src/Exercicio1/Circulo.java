package Exercicio1;

public class Circulo implements AreaCalculavel{
	private double raio;
	
	public Circulo(int valor) {
		this.raio = valor;
	}
	public double calculaArea(){
		return Math.PI*raio*raio;
	}

}
