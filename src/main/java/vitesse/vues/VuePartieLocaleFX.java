package vitesse.vues;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun_client.commandes.FabriqueCommande;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import vitesse_client.commandes.nouvelle_partie.NouvellePartie;
import vitesse_client.commandes.nouvelle_partie.NouvellePartiePourEnvoi;
import vitesse_client.commandes.retour_accueil.RetourAccueil;
import vitesse_client.commandes.retour_accueil.RetourAccueilPourEnvoi;
import vitesse_client.vues.VuePartieLocale;
import javafx.fxml.Initializable;

public class VuePartieLocaleFX implements VuePartieLocale, Initializable {
	
	@FXML
	private Text texteTmpPartieLocale, texteNombreCoups;
	
	@FXML
	private Button boutonJouerCoup, boutonRetour;
	
	private NouvellePartiePourEnvoi jouerCoup;

	private RetourAccueilPourEnvoi retourAccueil;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		J.appel(this);
		


		DoitEtre.nonNul(boutonRetour);
		
		// Nouvelle vue?
	} 

	@Override
	public void obtenirCommandesPourEnvoi() {
		J.appel(this);
		
		jouerCoup = FabriqueCommande.obtenirCommandePourEnvoi(NouvellePartie.class);

		retourAccueil = FabriqueCommande.obtenirCommandePourEnvoi(RetourAccueil.class);
	}

	@Override
	public void installerCapteursEvenementsUsager() {
		J.appel(this);
		


		boutonRetour.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				retourAccueil.envoyerCommande();
			}
		});
	}

	private int extraireInfoCoup() {
		J.appel(this);

		return (new Random()).nextInt(3);
	}

	@Override
	public void verifierCommandesPossibles() {
		J.appel(this);
	}

	@Override
	public void afficherNombreCoups(int nombreCoups) {
		J.appel(this);
		
		texteNombreCoups.setText(String.valueOf(nombreCoups));
	}

}
