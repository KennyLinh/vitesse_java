package vitesse_client.controleurs;

import vitesse.modeles.partie_locale.PartieLocale;
import vitesse.modeles.partie_locale.PartieLocaleLectureSeule;
import vitesse_client.afficheurs.AfficheurPartieLocale;
import vitesse_client.vues.VuePartieLocale;

public abstract class ControleurPartieLocale<V extends VuePartieLocale, 
                                             A extends AfficheurPartieLocale<V>>

                extends ControleurPartie<PartieLocaleLectureSeule, 
                                         PartieLocale, 
                                         V, 
                                         A> {
	
}
