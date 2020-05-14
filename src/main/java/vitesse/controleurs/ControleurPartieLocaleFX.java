package vitesse.controleurs;

import commun.debogage.J;
import vitesse_client.controleurs.ControleurPartieLocale;
import vitesse.afficheurs.AfficheurPartieLocaleFX;
import vitesse.vues.VuePartieLocaleFX;

public class   ControleurPartieLocaleFX 

       extends ControleurPartieLocale<VuePartieLocaleFX, 
                                      AfficheurPartieLocaleFX> {
	@Override
	protected void obtenirMessagesPourEnvoi() {
	    J.appel(this);

	}

	@Override
	protected void installerReceptionMessages() {
	    J.appel(this);

	}
}
