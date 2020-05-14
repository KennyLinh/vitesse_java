package vitesse.vues.composants;
import vitesse.vues.composants.Cartes.*;

public class PaquetCarte {
	
	


	    private Cartes[] cartes = new Cartes[52];

	    public PaquetCarte() {
	        refill();
	    }

	    public final void refill() {
	        int i = 0;
	        for (Face face : Face.values()) {
	            for (Rang rang : Rang.values()) {
	                cartes[i++] = new Cartes(face, rang);
	            }
	        }
	    }

	    public Cartes drawCard() {
	        Cartes carte = null;
	        while (carte == null) {
	            int index = (int)(Math.random()*cartes.length);
	            carte = cartes[index];
	            cartes[index] = null;
	        }
	        return carte;
	    }
	}

	

