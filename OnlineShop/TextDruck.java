import java.util.ArrayList;
public class TextDruck implements DruckStrategie {
	public void drucken(ArrayList<Artikel> art){
		for (Artikel ar : art){
			System.out.println(ar.bezeichnung +": " + ar.einzelpreis);
		}
	}
}