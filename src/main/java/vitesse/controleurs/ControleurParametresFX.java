package vitesse.controleurs;

import vitesse_client.controleurs.ControleurParametres;
import commun.debogage.J;
import vitesse.afficheurs.AfficheurParametresFX;
import vitesse.vues.VueParametresFX;

public class ControleurParametresFX extends ControleurParametres<VueParametresFX, AfficheurParametresFX> {
	@Override
	protected void obtenirMessagesPourEnvoi() {
	    J.appel(this);

	}

	@Override
	protected void installerReceptionMessages() {
	    J.appel(this);

	}

}
