import java.util.ArrayList;
public class HtmlDruck implements DruckStrategie {
	public void drucken(ArrayList<Artikel> art){
			System.out.println("<table>");
			System.out.println("\t<tr>");
			System.out.println("\t\t<td>Artikel</td>");
			System.out.println("\t\t<td>Preis</td>");
			System.out.println("\t</tr>");
		for (Artikel ar : art){
			System.out.println("\t<tr>");
			System.out.println("\t\t<td>"+ar.bezeichnung+"</td>");
			System.out.println("\t\t<td>"+ar.einzelpreis+"</td>");
			System.out.println("\t</tr>");
		}
		System.out.println("</table>");
	}
}