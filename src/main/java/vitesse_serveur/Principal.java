package vitesse_serveur;

import commun.debogage.J;
import static vitesse.Constantes.*;

public class Principal {
	
	public static void main(String[] args) {
		J.appel(Principal.class);
		
		demarrerServeur();
	}
	
	private static void demarrerServeur() {
		J.appel(Principal.class);
		
		ServeurVitesse serveur = new ServeurVitesse(PORT);
		serveur.start();
	}

}
