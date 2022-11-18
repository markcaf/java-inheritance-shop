package generation.italy.shop;

public class Cuffie extends Prodotto {
	
	private String colore;
	private String tipologia;

	public Cuffie(String nome, String marca, int prezzo, String colore, String tipologia) {
		super(nome, marca, prezzo);
		this.colore = colore;
		this.tipologia = tipologia;
	}
	
	@Override
	public String toString() {
		
		return "Tipo prodotto: Cuffie"
		+ "\nCodice: " + getCodice()
		+ "\nNome: " + getNome()
		+ "\nMarca: " + getMarca()
		+ "\nColore: " + colore
		+ "\nWireless/Cablate: " + tipologia
		+ "\nPrezzo iva esclusa: " + mostraPrezzo()
		+ "\nPrezzo iva inclusa: " + prezzoConIva() + "\n";
	}

}
