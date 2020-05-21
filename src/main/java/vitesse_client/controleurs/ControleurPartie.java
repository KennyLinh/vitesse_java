package vitesse_client.controleurs;

import commun.debogage.J;
import commun_client.mvc.controleurs.ControleurModeleVue;
import commun_client.mvc.controleurs.RecepteurCommandeMVC;
import vitesse.modeles.partie.Partie;
import vitesse.modeles.partie.PartieLectureSeule;
import vitesse_client.afficheurs.AfficheurPartie;

import vitesse_client.vues.VuePartie;

public abstract class  ControleurPartie<PLS extends PartieLectureSeule, 
							    P extends Partie<PLS>,
                                V extends VuePartie, 
                                A extends AfficheurPartie<PLS, V>>

	            extends ControleurModeleVue<PLS, P, V, A> {

	@Override
	protected void demarrer() {
		J.appel(this);
	}

	@Override
	protected void obtenirMessagesPourEnvoi() {
		J.appel(this);
		
	}

	@Override
	protected void installerReceptionMessages() {
		J.appel(this);
		
	}

	@Override
	protected void installerReceptionCommandes() {
		J.appel(this);
		

	} 
	

}
