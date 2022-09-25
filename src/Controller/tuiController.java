package Controller;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class tuiController{
	
	private final String labelText ="Hello! \n I am a TUI, or 'text user interface'. "
			+ "\n I came before the graphical user interfaces of today. "
			+ "\n I am from a long-gone era where users had no choice but to execute commands without their fingers leaving the home row."
			+"\n You either remember me fondly or hate the pain I put you through. #SorryNotSorry";
	
    @FXML
    private Label Label;

    @FXML
    private Pane Pane;
    
    @FXML
    private Line bottomLine;

    @FXML
    private Line leftLine;

    @FXML
    private Rectangle mainRect;

    @FXML
    private Line rightLine;

    @FXML
    private Rectangle shadowRect;

    @FXML
    private Label titleLabel;

    @FXML
    private Rectangle titleRect;

    @FXML
    private Line topLine;
    
    private boolean isRunning = false;
    private boolean isDone = false;

    @FXML
    void BeginTyping(MouseEvent event) {
    	if (!isRunning && !isDone) {
    		update();
    	}
    	
    }
    
	void update() {
		isRunning = true;
		final IntegerProperty i = new SimpleIntegerProperty(0);
		Timeline timeline = new Timeline();
		KeyFrame keyFrame = new KeyFrame(Duration.seconds(.07), Event -> {
			if (i.get() > labelText.length()) {
				timeline.jumpTo(Duration.ZERO);
			} else {
				Label.setText(labelText.substring(0, i.get()));
				i.set(i.get() + 1);
			}
		});
		timeline.getKeyFrames().add(keyFrame);
		timeline.setAutoReverse(true);
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.play();
		timeline.setOnFinished(event -> { isRunning = false; isDone = true;});
	}
   
}