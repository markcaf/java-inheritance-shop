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
	
	public int mostraPrezzo() {
		return prezzo;
	}
	
	public int prezzoConIva() {
		int prezzoIva = prezzo + ((prezzo * iva) / 100);
		return prezzoIva;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public int getCodice() {
		return codice;
	}
	
	@Override
	public String toString() {
		
		return "Prodotto "
				+ "\nCodice: " + codice
				+ "\nNome: " + nome
				+ "\nMarca: " + marca
				+ "\nPrezzo iva esclusa: " + mostraPrezzo()
				+ "\nPrezzo iva inclusa: " + prezzoConIva();
	}

}
