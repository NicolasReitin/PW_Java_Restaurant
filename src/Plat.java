import java.util.ArrayList;
import java.util.List;

public class Plat {

	private String name;
	private Double prix;
	
	
	public Plat(String name, Double prix) {
		this.name = name;
		this.prix = prix;
	}


	public String getName() {
		return name;
	}


	public Double getPrix() {
		return prix;
	}
	
	public String toString() {
		return this.getName() + " - "
				+ this.getPrix() + "€";
	}
	
	
	
}
