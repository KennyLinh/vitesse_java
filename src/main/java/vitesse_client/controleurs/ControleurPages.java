package vitesse_client.controleurs;

import commun_client.mvc.controleurs.ControleurVue;
import vitesse_client.vues.VueAccueil;
import vitesse_client.vues.VuePages;

public abstract class ControleurPages<V extends VuePages> extends ControleurVue<V> {}
