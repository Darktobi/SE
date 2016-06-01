import java.util.ArrayList;
public class Rechnung{
	private DruckStrategie druck = null;
	
	private ArrayList<Artikel> artList = new ArrayList<Artikel>();
	
	public void setStrategie(DruckStrategie druck){
		this.druck = druck;
	}
	
	public void add(Artikel art){
		artList.add(art);
	}
	
	public void drucken(){
		druck.drucken(artList);
	}

}