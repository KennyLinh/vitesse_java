package vitesse_client.controleurs;

import commun.debogage.J;
import commun.messages.FabriqueMessage;
import commun_client.mvc.controleurs.RecepteurMessageMVC;
import vitesse.modeles.partie_reseau.PartieReseau;
import vitesse.modeles.partie_reseau.PartieReseauLectureSeule;
import vitesse_client.afficheurs.AfficheurPartieReseau;
import vitesse_client.vues.VuePartieReseau;

public abstract class ControleurPartieReseau<V extends VuePartieReseau, 
                                             A extends AfficheurPartieReseau<V>>

                extends ControleurPartie<PartieReseauLectureSeule, 
                        PartieReseau, 
                        V, 
                        A> {
	
	
}
