package model;

public class CartaoCashBack extends CartaoPre {

	protected int tipo;
	
	public CartaoCashBack (String numeroCartao, String nomeTitular, int anoValidade, int mesVaidade, int tipo) {
		super(numeroCartao, nomeTitular, anoValidade, mesVaidade);
		this.tipo = tipo;
	}

	public boolean comprar(double valor) {
		if (super.saldo >= valor) {
			super.saldo -= valor;
			this.bonus(valor);
			return true;
		}
		else {
			return false;
		}
	}
	
	public void bonus (double valor) {
		switch (tipo) {
		case 1:		
			super.saldo += valor*2/100;
			break;
		case 2:		
			super.saldo += valor*5/100;
			break;
		case 3:		
			super.saldo += valor*8/100;
			break;
		}
	}
	
}
