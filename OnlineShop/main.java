public class main{
	public static void main(String[] args){
		Artikel art1 = new Artikel("Festplatte", 89.99f);
		Artikel art2 = new Artikel("USB-Stick", 19.99f);
		Artikel art3 = new Artikel("Mauspad", 3.33f);
		
		System.out.println("Text Druck:\n");
		Rechnung rechnung = new Rechnung();
		rechnung.add(art1);
		rechnung.add(art2);
		rechnung.setStrategie(new TextDruck());
		rechnung.drucken();
		
		
		System.out.println("\nHTML Druck:\n");
		Rechnung rechnung2 = new Rechnung();
		rechnung2.add(art1);
		rechnung2.add(art3);
		rechnung2.setStrategie(new HtmlDruck());
		rechnung2.drucken();
	
	}
}