package vitesse.vues.composants;



import commun.debogage.J;
import javafx.beans.NamedArg;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;


public class CarteCouleurChoisi extends RadioButton  {
	
	public CarteCouleurChoisi(@NamedArg ("url") String url) {
		
			super(url);
			J.appel(this);
			
			
		
		}	

	
	}

		

