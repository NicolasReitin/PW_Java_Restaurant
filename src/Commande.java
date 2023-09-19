import java.util.ArrayList;
import java.util.List;

public class Commande {

	private Client client;
	private Restaurant restaurant;
	private Livreur livreur;
	private List<Plat> platsCommande = new ArrayList<>();
	
	
	public Commande(Client client, Restaurant restaurant) {
		this.client = client;
		this.restaurant = restaurant;
	}

	public Client getClient() {
		return client;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public Livreur getLivreur() {
		return livreur;
	}

	
	public void ajouterPlatCommande(Plat plat) {
		this.platsCommande.add(plat);
	}
	
	
	public double calculerTotal() {
		double total = 0;
		
		for(Plat plat : platsCommande) {
			total += plat.getPrix();
		}
		return total;
	}
	
	public String toString() {
		return "                     BON DE COMMANDE \n \n \n"
				+ "La commande suivante a été passé par " + this.getClient().getName()
				+ "\n L'adresse de livraison est : " + this.getClient().getAdresse()
				+ "\n Tel : " + this.getClient().getTel()
				+ "\n \n \n Restaurant : " + this.getRestaurant().getName()
				+ "\n Adresse du restaurant : " + this.getRestaurant().getAdresse()
				+ "\n \n \n Plats commandés : "; //+ this.platsCommande; 
		
	}
	
	public String afficherPlatsCommande() {
		for( Plat plat : platsCommande) {
			System.out.println("     * " + plat.getName() + " - " + plat.getPrix());
		}
		return "";
	}
	

	
	
}
