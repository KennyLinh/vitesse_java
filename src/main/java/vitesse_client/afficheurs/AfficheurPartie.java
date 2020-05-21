package vitesse_client.afficheurs;

import java.util.List;

import commun.debogage.J;
import commun_client.mvc.Afficheur;

import vitesse.modeles.partie.PartieLectureSeule;
import vitesse_client.vues.VuePartie;

public abstract class   AfficheurPartie<PLS extends PartieLectureSeule, 
                                        V extends VuePartie> 

				extends Afficheur<PLS, V> {
	@Override
	public void initialiserAffichage(PLS modeleLectureSeule, V vue) {
	    J.appel(this);

	}

	@Override
	public void rafraichirAffichage(PLS modeleLectureSeule, V vue) {
	    J.appel(this);

	}


}
