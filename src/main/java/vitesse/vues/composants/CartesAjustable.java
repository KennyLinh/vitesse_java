package vitesse.vues.composants;

import commun.debogage.J;
import javafx.beans.NamedArg;

public class CartesAjustable extends ImageAjustable {
	public CartesAjustable(@NamedArg("url") String url) {
		
		super(url);
		J.appel(this);
		
	}
}
