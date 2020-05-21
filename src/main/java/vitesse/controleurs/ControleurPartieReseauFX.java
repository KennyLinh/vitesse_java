package vitesse.controleurs;

import vitesse_client.controleurs.ControleurPartieReseau;
import commun.debogage.J;
import vitesse.afficheurs.AfficheurPartieReseauFX;
import vitesse.vues.VuePartieReseauFX;

public class   ControleurPartieReseauFX 

       extends ControleurPartieReseau<VuePartieReseauFX, 
                                      AfficheurPartieReseauFX> {

	
	@Override
	protected void obtenirMessagesPourEnvoi() {
	    J.appel(this);

	}

	@Override
	protected void installerReceptionMessages() {
	    J.appel(this);

	}

}
