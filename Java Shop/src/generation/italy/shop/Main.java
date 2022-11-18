package generation.italy.shop;

public class Main {

	public static void main(String[] args) {

		Prodotto prodotto1 = new Prodotto(
				"POCO X4 NFC",
				"Xiaomi",
				420);
		
		Prodotto prodotto2 = new Prodotto(
				"TV 4K Res 2501",
				"LG",
				1299);
		
		Smartphone tel1 = new Smartphone(
				"S12 Ultra", 
				"Samsung", 
				660, 
				1234512340, 
				1024);
		
		System.out.println(prodotto1.toString());
		System.out.println(prodotto2.toString());
		System.out.println(tel1.toString());

	}

}
