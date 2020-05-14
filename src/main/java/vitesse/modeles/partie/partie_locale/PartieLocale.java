package vitesse.modeles.partie.partie_locale;

import java.util.Random;

import commun.debogage.J;
import vitesse.modeles.partie.partie.Partie;

public class      PartieLocale 
       extends    Partie<PartieLocaleLectureSeule> 
       implements PartieLocaleLectureSeule { 
	
	public PartieLocale() {
		super();
		J.appel(this);

	}
}
