package Exercicio4;

public class ContaCorrente implements Tributavel{
	private double saldo;
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	public double calculaTributos() {
		return this.getSaldo()*0.01;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
