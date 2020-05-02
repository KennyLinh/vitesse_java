package vitesse.controleurs;

import java.util.Locale;

import commun.debogage.J;
import commun_client.mvc.controleurs.FabriqueControleur;
import commun_client.mvc.controleurs.RecepteurCommandeMVC;
import vitesse.modeles.parametres.Parametres;
import vitesse.modeles.parametres.ParametresLectureSeule;
import vitesse.modeles.partie_locale.PartieLocale;
import vitesse_client.commandes.changer_locale.ChangerLocale;
import vitesse_client.commandes.changer_locale.ChangerLocaleRecue;
import vitesse_client.commandes.nouvelle_partie.NouvellePartie;
import vitesse_client.commandes.nouvelle_partie.NouvellePartieRecue;
import vitesse_client.commandes.ouvrir_parametres.OuvrirParametres;
import vitesse_client.commandes.ouvrir_parametres.OuvrirParametresRecue;
import vitesse_client.commandes.retour_accueil.RetourAccueil;
import vitesse_client.commandes.retour_accueil.RetourAccueilRecue;
import vitesse_client.controleurs.ControleurPages;
import vitesse.afficheurs.AfficheurParametresFX;
import vitesse.afficheurs.AfficheurPartieLocaleFX;
import vitesse.vues.VueAccueilFX;
import vitesse.vues.VuePagesFX;
import vitesse.vues.VueParametresFX;
import vitesse.vues.VuePartieLocaleFX;

public class ControleurPagesFX extends ControleurPages<VuePagesFX> {

	private static final Parametres parametres = new Parametres();
	
	public static ParametresLectureSeule getParametres() {
		J.appel(ControleurAccueilFX.class);
		
		return (ParametresLectureSeule) parametres;
	}
	
	

	private PartieLocale partie = new PartieLocale();

	@Override
	protected void installerReceptionCommandes() {
		J.appel(this);

		installerRecepteurCommande(OuvrirParametres.class, new RecepteurCommandeMVC<OuvrirParametresRecue>() {
			@Override
			public void executerCommandeMVC(OuvrirParametresRecue commande) {
				J.appel(this);
				
				vue.afficherPageParametres();
			}
		});

		installerRecepteurCommande(RetourAccueil.class, new RecepteurCommandeMVC<RetourAccueilRecue>() {
			@Override
			public void executerCommandeMVC(RetourAccueilRecue commande) {
				J.appel(this);
				
				vue.afficherPageAccueil();
			}
		});
		
		installerRecepteurCommande(NouvellePartie.class, new RecepteurCommandeMVC<NouvellePartieRecue>() {
			@Override
			public void executerCommandeMVC(NouvellePartieRecue commande) {
				J.appel(this);
				
				nouvellePartieLocale();
				vue.afficherPagePartieLocale();
			}
		});
		
		installerRecepteurCommande(ChangerLocale.class, new RecepteurCommandeMVC<ChangerLocaleRecue>() {
			@Override
			public void executerCommandeMVC(ChangerLocaleRecue commande) {
				J.appel(this);
				
				Locale.setDefault(commande.getLocale());
				
				instancierMVCParametres();
				instancierMVCAccueil();
			}
		});
	}
	
	@Override
	protected void demarrer() {
		J.appel(this);
		
		instancierMVCParametres();
		instancierMVCAccueil();
	}


	private void instancierMVCParametres(){
		J.appel(this);

		VueParametresFX vueParametresFX = vue.creerVueParametres();

		AfficheurParametresFX afficheurParametresFX = new AfficheurParametresFX();

		FabriqueControleur.creerControleur(ControleurParametresFX.class, parametres, vueParametresFX, afficheurParametresFX);
	}

	private void instancierMVCAccueil(){
		J.appel(this);

		VueAccueilFX vueAcceuil = vue.creerVueAccueil();

		FabriqueControleur.creerControleur(ControleurAccueilFX.class, vueAcceuil);
	}

	private void nouvellePartieLocale() {
		J.appel(this);

		partie = new PartieLocale();
		instancierMVCPartieLocale();
	}

	private void instancierMVCPartieLocale() {
		J.appel(this);
		
		VuePartieLocaleFX vuePartie = vue.creerVuePartieLocale();
		
		AfficheurPartieLocaleFX afficheur = new AfficheurPartieLocaleFX();
		
		FabriqueControleur.creerControleur(ControleurPartieLocaleFX.class, partie, vuePartie, afficheur);
	}

}
