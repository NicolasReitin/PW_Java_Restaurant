
public class Client {

	
	private String name;
	private String adresse;
	private String tel;
	
	//constructor
	public Client(String name, String adresse, String tel) {
		this.name = name;
		this.adresse = adresse;
		this.tel = tel;
	}

	//getters
	public String getName() {
		return name;
	}


	public String getAdresse() {
		return adresse;
	}


	public String getTel() {
		return tel;
	}
	
	//fonction pour passer que le client passe une commnande
	public Commande passerCommande(Restaurant restaurant) {
		return new Commande(this, restaurant); 
	}
	
	
	
}
