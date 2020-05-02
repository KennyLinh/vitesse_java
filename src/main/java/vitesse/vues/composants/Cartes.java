package vitesse.vues.composants;

import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Cartes extends Parent {

	enum Face {
		
		COEUR,DIAMAND,PIQUE,TREFLE
		
	};
	
	enum Rang {
		
		ACE(1),DEUX(2),TROIS(3),QUATRE(4),CINQ(5),SIX(6),SEPT(7),HUIT(8),NEUF(9),DIX(10),VALET(11),DAME(12),ROI(13);
		final int VALEUR;
		
		private Rang(int VALEUR) {
			
			this.VALEUR = VALEUR;
			
		}
		
	};
	
	public final Face FACE;
	public final Rang RANG;
	public final int VALEUR;
	
	public Cartes (Face FACE, Rang RANG) {
		
		this.FACE = FACE;
		this.RANG = RANG;
		this.VALEUR = RANG.VALEUR;
		
		Rectangle arrierePlan = new Rectangle(80,100);
		arrierePlan.setArcWidth(20);
		arrierePlan.setArcHeight(20);
		arrierePlan.setFill(Color.WHITE);
		
		Text text = new Text(toString());
	    text.setWrappingWidth(70);
	    
	    getChildren().add(new StackPane(arrierePlan,text));
	    
	}
	
	@Override
	
	public String toString() {
		
		return RANG.toString()+" de "+FACE.toString();
	}
}
