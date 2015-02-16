package Exercicio1;

public class Teste {
	public static void main(String[] args) {
		//a seguinte classe de Teste repare no polimorfismo.
		//Poderíamos passar esses objetos como argumento para 
		//alguém que aceitasse AreaCalculavel como argumento:
		AreaCalculavel a = new Retangulo(3,2);
		System.out.println("Área do Retângulo: "+a.calculaArea());
		
		AreaCalculavel b = new Circulo(3);
		System.out.println("Área do Circulo: "+b.calculaArea());
	}

}
