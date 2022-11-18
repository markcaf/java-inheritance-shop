package generation.italy.shop;

public class Televisore extends Prodotto {
	
	private int dimensioni;
	private boolean is_smart;

	public Televisore(String nome, String marca, int prezzo, int dimensioni, boolean is_smart) {
		super(nome, marca, prezzo);
		this.dimensioni = dimensioni;
		this.is_smart = is_smart;
	}
	
	@Override
	public String toString() {
		
		return "Tipo prodotto: Televisore"
		+ "\nCodice: " + getCodice()
		+ "\nNome: " + getNome()
		+ "\nMarca: " + getMarca()
		+ "\nDimensioni: " + dimensioni + " pollici"
		+ "\nSmart tv: " + is_smart
		+ "\nPrezzo iva esclusa: " + mostraPrezzo()
		+ "\nPrezzo iva inclusa: " + prezzoConIva() + "\n";
	}
}
