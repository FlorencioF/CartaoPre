package model;

public class CartaoPre {

	protected String numeroCartao;
	protected String nomeTitular;
	protected int anoValidade;
	protected int mesVaidade;
	protected double saldo;
	
	public CartaoPre(String numeroCartao, String nomeTitular, int anoValidade, int mesVaidade) {
		super();
		this.numeroCartao = numeroCartao;
		this.nomeTitular = nomeTitular;
		this.anoValidade = anoValidade;
		this.mesVaidade = mesVaidade;
		this.saldo = 0.0;
	}
	
	@Override
	public String toString() {
		return String.format("Numero do cartão: %s\nTitular: %s\nSaldo: R$ %.2f", this.numeroCartao, this.nomeTitular, this.saldo);
	}
	
	public void adicionarCredito(double credito) {
		this.saldo += credito;
	}
	
	public boolean comprar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
}
