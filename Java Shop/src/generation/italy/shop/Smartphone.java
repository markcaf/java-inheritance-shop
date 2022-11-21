package generation.italy.shop;

public class Smartphone extends Prodotto {
	
	private String codiceImei;
	private int memoria;

	public Smartphone(String nome, String marca, int prezzo, String codiceImei, int memoria) {
		super(nome, marca, prezzo);
		this.codiceImei = codiceImei;
		this.memoria = memoria;
	}

	@Override
	public String toString() {
		
		return "Tipo prodotto: Smartphone"
		+ "\nCodice: " + getCodice()
		+ "\nNome: " + getNome()
		+ "\nMarca: " + getMarca()
		+ "\nCodice IMEI: " + codiceImei
		+ "\nMemoria: " + memoria +" GB"
		+ "\nPrezzo iva esclusa: " + mostraPrezzo()
		+ "\nPrezzo iva inclusa: " + prezzoConIva() + "\n";
	}

}
