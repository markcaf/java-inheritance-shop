package generation.italy.shop;

public class Main {

	public static void main(String[] args) {

		Prodotto prodotto1 = new Prodotto(
				"FENDER Classic Vibe '70s Telecaster Deluxe",
				"Fender",
				420);
		
		Prodotto prodotto2 = new Prodotto(
				"FENDER FSR Affinity Stratocaster",
				"Fender",
				299);
		
		System.out.println(prodotto1.toString());
		System.out.println();
		System.out.println(prodotto2.toString());

	}

}
