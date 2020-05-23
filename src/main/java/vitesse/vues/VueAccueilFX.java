package vitesse.vues;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun.systeme.Systeme;
import commun_client.commandes.FabriqueCommande;
import commun_javafx.ChargeurDeVue;
import commun_javafx.DialogueModal;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import vitesse_client.commandes.sauvegarder_partie.SauvegarderPartiePourEnvoi;
import vitesse_client.commandes.nouvelle_partie.NouvellePartie;
import vitesse_client.commandes.nouvelle_partie.NouvellePartiePourEnvoi;
import vitesse_client.commandes.ouvrir_parametres.OuvrirParametres;
import vitesse_client.commandes.ouvrir_parametres.OuvrirParametresPourEnvoi;
import vitesse_client.commandes.quitter.Quitter;
import vitesse_client.commandes.quitter.QuitterPourEnvoi;
import vitesse_client.vues.VueAccueil;
import static vitesse.Constantes.*;

public class VueAccueilFX implements VueAccueil, Initializable {
	
	@FXML
	MenuItem menuNouvellePartieLocale, 
	         menuSauvegarderPartieLocale, 
	         menuParametres, 
	         menuQuitter;
	
	@FXML
	Button boutonNouvellePartie, boutonOuvrirParametres;
	SauvegarderPartiePourEnvoi sauvegarderPartiePourEnvoi;
	OuvrirParametresPourEnvoi ouvrirParametresPourEnvoi;
	NouvellePartiePourEnvoi nouvellePartiePourEnvoi;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		J.appel(this);
		
		DoitEtre.nonNul(boutonNouvellePartie);
		DoitEtre.nonNul(boutonOuvrirParametres);
	}

	@Override
	public void obtenirCommandesPourEnvoi() {
		J.appel(this);
		
		ouvrirParametresPourEnvoi = FabriqueCommande.obtenirCommandePourEnvoi(OuvrirParametres.class);
		nouvellePartiePourEnvoi = FabriqueCommande.obtenirCommandePourEnvoi(NouvellePartie.class);
	}

	@Override
	public void installerCapteursEvenementsUsager() {
		J.appel(this);
		
		boutonOuvrirParametres.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				ouvrirParametresPourEnvoi.envoyerCommande();
			}
		});
		
		boutonNouvellePartie.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				nouvellePartiePourEnvoi.envoyerCommande();
				

				menuSauvegarderPartieLocale.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent event) {
						J.appel(this);
						
						File fichierChoisi = DialogueModal.ouvrirDialogueFichiers();

						if(fichierChoisi != null) {

							String cheminDansHome = Systeme.cheminDansHome(fichierChoisi);

							sauvegarderPartiePourEnvoi.setCheminDansHome(cheminDansHome);
							sauvegarderPartiePourEnvoi.envoyerCommande();
						}
					}
				});
			}
		});
	}



	@Override
	public void verifierCommandesPossibles() {
		J.appel(this);
	}

}
