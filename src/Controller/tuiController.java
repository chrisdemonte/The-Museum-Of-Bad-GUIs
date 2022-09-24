package Controller;

import java.io.IOException;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class tuiController{
	
	private final String labelText ="Hello! \n I am a TUI, or 'text user interface'. \n I came before the graphical user interfaces of today from a long-gone era when many commands could be executed without your fingers even leaving the home row.";
	
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

    @FXML
    void BeginTyping(MouseEvent event) {
    	final IntegerProperty i = new SimpleIntegerProperty(0);
    	Timeline timeline = new Timeline();
    	KeyFrame keyFrame = new KeyFrame(
    			Duration.seconds(1),
    			Event -> {
    				if (i.get() > labelText.length()) {
    					timeline.stop();
    				} else {
    					Label.setText(labelText.substring(0, i.get()));
    					i.set(i.get()+1);
    				}
    			});
    	timeline.getKeyFrames().add(keyFrame);
    	timeline.setCycleCount(Animation.INDEFINITE);
    	timeline.play();
    			
    }
   
}