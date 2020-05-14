package vitesse.vues.composants;

import commun.debogage.J;   
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.util.Duration;
import javafx.scene.control.RadioButton;

public class MonRadio extends RadioButton {

	
	
	private Timeline animationSurvol = new Timeline();

	public MonRadio() {
		super();
		J.appel(this);
		
	}

	private void installerListeners() {
		J.appel(this);

		this.setOnMouseEntered(new EventHandler<Event>() {

			public void handle(Event event) {
				J.appel(this);

				animationSurvol.playFromStart();
			}
		});

		this.setOnMouseExited(new EventHandler<Event>() {

			public void handle(Event event) {
				J.appel(this);

				animationSurvol.stop();
				MonRadio.this.setOpacity(1);
			}
		});

	}

	private void creerAnimation() {
		J.appel(this);

		double delaiMilisecondes = 500;
		double opaciteNormale = 1.0;
		double opaciteBasse = 0.7;

		animationSurvol.getKeyFrames()
				.add(new KeyFrame(Duration.ZERO, new KeyValue(opacityProperty(), opaciteNormale)));

		animationSurvol.getKeyFrames()
				.add(new KeyFrame(new Duration(delaiMilisecondes), new KeyValue(opacityProperty(), opaciteBasse)));

		animationSurvol.getKeyFrames()
				.add(new KeyFrame(new Duration(delaiMilisecondes * 2), new KeyValue(opacityProperty(), opaciteNormale)));
	}

}