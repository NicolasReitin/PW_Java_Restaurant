import java.util.ArrayList;
import java.util.List;

public class Restaurant {

	private String name;
	private String adresse;
	private List<Plat> plats = new ArrayList<>();
	
	
	public Restaurant(String name, String adresse) {
		this.name = name;
		this.adresse = adresse;
	}


	public String getName() {
		return name;
	}


	public String getAdresse() {
		return adresse;
	}


	public List<Plat> getPlats() {
		return plats;
	}
	
	public void ajouterPlat(Plat plat) {
		this.plats.add(plat); // ajoute un plat à la liste des plats
	}
	
	
	public String toString() {
		return this.getName() 
				+ " propose plusieurs plats à sa carte : ";
				//+ plats;	
	}
	
	public String afficherPlats() {
		for (Plat plat : this.getPlats()) {
			System.out.println(plat);
		}
		return "\n";
	}
	
	
}
