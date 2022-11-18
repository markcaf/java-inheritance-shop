package generation.italy.shop;

import java.util.Random;

public class Prodotto {
	
	private int codice;
	private String nome;
	private String marca;
	private int prezzo;
	private int iva;
	
	public Prodotto(String nome, String marca, int prezzo) {
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = 20;
		Random rnd = new Random();
		this.codice = rnd.nextInt(00000,99999);
	}

}
