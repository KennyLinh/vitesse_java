package vitesse_serveur;

import commun.debogage.J;
import commun_serveur.ServeurWebSocket;

public class ServeurVitesse extends ServeurWebSocket {

	public ServeurVitesse(int port) {
		super(port);
		J.appel(this);
	}

}
