package vitesse_java;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun_javafx.ChargeurDeVue;
import commun_javafx.Initialisateur;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Principal extends Application {

	static {
		J.appel(Principal.class);

		Initialisateur.initialiser();

	}

	public static void main(String[] args) {
	
		J.appel(Principal.class);

		launch(args);

	}

	@Override
	public void start(Stage fenetrePrincipale) throws Exception {


		J.appel(this);
		fenetrePrincipale.setTitle("Configuration");
		Scene scene = creerScenePrincipale();

		fenetrePrincipale.setScene(scene);

		fenetrePrincipale.show();

	}

	private Scene creerScenePrincipale() {

		J.appel(this);

		ChargeurDeVue chargeur = new ChargeurDeVue(Constantes.CHEMIN_PARTIE_LOCALE_FXML,Constantes.CHEMIN_CHAINES,Constantes.CHEMIN_PARTIE_LOCALE_CSS);

		Scene scene = chargeur.nouvelleScene(600,400);

		DoitEtre.nonNul(scene);

		return scene;
	}

	@Override
	public void stop() {
		J.appel(this);
	}



}


	
