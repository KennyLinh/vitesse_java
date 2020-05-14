package vitesse_client.afficheurs;

import vitesse.modeles.partie_reseau.PartieReseauLectureSeule;
import vitesse_client.vues.VuePartieReseau;

public abstract class   AfficheurPartieReseau<V extends VuePartieReseau>

                extends AfficheurPartie<PartieReseauLectureSeule, V>  {

}
