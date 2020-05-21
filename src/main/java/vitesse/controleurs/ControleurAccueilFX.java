package vitesse.controleurs;

import commun.debogage.J;
import commun.systeme.Systeme;
import commun_client.commandes.FabriqueCommande;
import commun_client.commandes.RecepteurCommande;
import commun_client.mvc.controleurs.FabriqueControleur;
import commun_client.mvc.controleurs.RecepteurCommandeMVC;
import commun_javafx.ChargeurDeVue;
import commun_javafx.DialogueModal;
import javafx.scene.Scene;
import javafx.stage.Stage;
import vitesse.modeles.parametres.Parametres;
import vitesse.modeles.parametres.ParametresLectureSeule;
import vitesse.modeles.partie_locale.PartieLocale;
import vitesse_client.commandes.nouvelle_partie.NouvellePartie;
import vitesse_client.commandes.nouvelle_partie.NouvellePartieRecue;
import vitesse_client.commandes.ouvrir_parametres.OuvrirParametres;
import vitesse_client.commandes.ouvrir_parametres.OuvrirParametresRecue;
import vitesse_client.commandes.quitter.Quitter;
import vitesse_client.commandes.quitter.QuitterRecue;
import vitesse_client.commandes.retour_accueil.RetourAccueil;
import vitesse_client.commandes.retour_accueil.RetourAccueilRecue;
import vitesse_client.controleurs.ControleurAccueil;
import vitesse.afficheurs.AfficheurParametresFX;
import vitesse.afficheurs.AfficheurPartieLocaleFX;
import vitesse.vues.VuePartieLocaleFX;
import vitesse.vues.VueAccueilFX;
import vitesse.vues.VueParametresFX;

import static vitesse.Constantes.*;

public class ControleurAccueilFX extends ControleurAccueil<VueAccueilFX> {
	
	
	private Scene sceneParametres;
	private Stage dialogueParametres;
	
	
	@Override
	protected void installerReceptionCommandes() {
		J.appel(this);
		
	}

	
	
	
	private void ouvrirParametres() {
		J.appel(this);

		dialogueParametres = DialogueModal.ouvrirDialogueModal(sceneParametres);
	}

	private void fermerParametres() {
		J.appel(this);
		
		if(dialogueParametres != null) {
			
			dialogueParametres.close();
		}
	}

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
}
