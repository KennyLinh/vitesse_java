package vitesse.vues.composants;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import vitesse.vues.composants.Cartes.Rang;


public class MainDeCarte {
	
	private ObservableList<Node> cartes;
    private SimpleIntegerProperty value = new SimpleIntegerProperty(0);

    private int aces = 0;

    public MainDeCarte(ObservableList<Node> cartes) {
        this.cartes = cartes;
    }

    public void takeCard(Cartes carte) {
        cartes.add(carte);

        if (carte.RANG == Rang.ACE) {
            aces++;
        }

        if (value.get() + carte.VALEUR > 21 && aces > 0) {
            value.set(value.get() + carte.VALEUR - 10);    //then count ace as '1' not '11'
            aces--;
        }
        else {
            value.set(value.get() + carte.VALEUR);
        }
    }

    public void reset() {
        cartes.clear();
        value.set(0);
        aces = 0;
    }

    public SimpleIntegerProperty valueProperty() {
        return value;
    }
}

