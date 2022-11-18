package generation.italy.shop;

public class Main {

	public static void main(String[] args) {
		
		Smartphone tel1 = new Smartphone(
				"S12 Ultra", 
				"Samsung", 
				660, 
				1234512340, 
				1024);
		
		Televisore tv1 = new Televisore(
				"TV 4K Res 2501", 
				"LG", 
				1200, 
				50, 
				true);
		
		Cuffie c1 = new Cuffie(
				"In Ear 10X", 
				"JBL", 
				20, 
				"Nero", 
				"Wireless");
		
		System.out.println(tel1.toString());
		System.out.println(tv1.toString());
		System.out.println(c1.toString());

	}

}
