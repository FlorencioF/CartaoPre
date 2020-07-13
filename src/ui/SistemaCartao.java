package ui;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.CartaoCashBack;
import model.CartaoPre;

public class SistemaCartao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<CartaoPre> cartoes = new ArrayList<CartaoPre>();
		
		cartoes.add(new CartaoPre("1234 5678 9012", "Fernando", 2027, 4));
		cartoes.add(new CartaoCashBack("1234 1234 1234", "Florencio", 2028, 6, 3));
		
		for (CartaoPre c: cartoes) {
		
			c.adicionarCredito(1000);
			if (c.comprar(500)){
				JOptionPane.showMessageDialog(null, String.format("Compra no valor de R$ %.2f aprovada", 500.0));
				JOptionPane.showMessageDialog(null, c.toString());
			}
			else {
				JOptionPane.showMessageDialog(null, "Saldo insuficiente");
			}
			c.toString();
		}
		

	}

	public void validarCompra(CartaoPre cartao, double valor) {
		if (cartao.comprar(valor)){
			JOptionPane.showMessageDialog(null, String.format("Compra no valor de R$ %.2f aprovada", valor));
			JOptionPane.showMessageDialog(null, cartao.toString());
		}
		else {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente");
		}
	}
}
