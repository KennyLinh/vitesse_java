package vitesse_client.commandes.nouvelle_partie;

import commun.debogage.J;
import commun_client.commandes.Commande;

public class NouvellePartie extends Commande<NouvellePartiePourEnvoi, 
                                             NouvellePartieRecue>

							implements NouvellePartiePourEnvoi, 
							           NouvellePartieRecue {
	
	private int infoCoup;

	@Override
	public int getInfoCoup() {
		J.appel(this);

		return infoCoup;
	}

	@Override
	public void setInfoCoup(int infoCoup) {
		J.appel(this);

		this.infoCoup = infoCoup;
	}
}
