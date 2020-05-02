package vitesse_client.afficheurs;


import commun.debogage.J;
import commun.modeles.Modele;
import commun_client.mvc.Afficheur;
import vitesse.modeles.partie_locale.PartieLocaleLectureSeule;
import vitesse_client.vues.VuePartieLocale;

public abstract class AfficheurPartieLocale<V extends VuePartieLocale> 

                            extends Afficheur<PartieLocaleLectureSeule, 
                                              V> {

    @Override
    public void initialiserAffichage(PartieLocaleLectureSeule partieLectureSeule, VuePartieLocale vue) {
        J.appel(this);
        
    }

    @Override
    public void rafraichirAffichage(PartieLocaleLectureSeule partieLectureSeule, VuePartieLocale vue) {
        J.appel(this);

    }
}
