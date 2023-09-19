
public class Main {

	public static void main(String[] args) {
		
		Client client1 = new Client("Nico", "52 bis rue Brière, 14120 Mondeville", "06.02.08.34.43");
		Client client2 = new Client("Flo", "20 rue de la madeleine, 93100 Montreuil", "06.07.08.09.10");
		
		Livreur livreur1 = new Livreur("Ronan", "vélo éléctrique");
		Livreur livreur2 = new Livreur("Jérémy", "trotinette éléctrique");

		Restaurant resto1 =  new Restaurant("Mcdo", "2 allée du Bac, 14120 Mondeville");
		Restaurant resto2 =  new Restaurant("Burger King", "7 chemin de la Cavée, 14120 Mondeville");
		Restaurant resto3 =  new Restaurant("Le Safran", "11 Rue Saint-Sauveur, 14000 Caen");

		Plat burger = new Plat("Burger", 8.99);		
		Plat nuggets = new Plat("Nuggets x 6", 5.99);		
		Plat wrap = new Plat("Wrap", 6.99);		
		Plat kebab = new Plat("Kebab", 8.99);
		
		resto1.ajouterPlat(burger);
		resto1.ajouterPlat(nuggets);
		resto1.ajouterPlat(wrap);
		
		resto2.ajouterPlat(burger);
		resto2.ajouterPlat(nuggets);

		resto3.ajouterPlat(nuggets);
		resto3.ajouterPlat(kebab);
		
		System.out.println(resto1);
		System.out.println(resto1.afficherPlats());

		System.out.println(resto2);
		System.out.println(resto2.afficherPlats());
		
		System.out.println(resto3);
		System.out.println(resto2.afficherPlats());

		
		
		System.out.println("\n ****************************************************************************************** \n");
		
		Commande commande1 = client1.passerCommande(resto1);

		commande1.ajouterPlatCommande(burger);
		commande1.ajouterPlatCommande(nuggets);

		System.err.println(commande1);
		System.out.println(commande1.afficherPlatsCommande());
			
				
		double total = commande1.calculerTotal();
			System.out.println("\n Le total de votre commande est de : " + total + " €.");
			
			
		System.out.println("\n ****************************************************************************************** \n");
	
		
		livreur1.livrerCommande(commande1, true);

			
	}


}
