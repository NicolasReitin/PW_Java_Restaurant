
public class Livreur {

	private String name;
	private String transport;
	
	
	public Livreur(String name, String transport) {
		this.name = name;
		this.transport = transport;
	}

	public String getName() {
		return name;
	}

	public String getTransport() {
		return transport;
	}
	
	public void livrerCommande(Commande commande, boolean etatCommande) {
		if (etatCommande == true) {
			System.out.println("La commande a été livrée par " + this.name +".");
		}else {
			System.out.println("La commande est en cours de Livraison par " + this.name + " en utilisant son " + this.transport + ".");
		}
	}
	
	
	
}
