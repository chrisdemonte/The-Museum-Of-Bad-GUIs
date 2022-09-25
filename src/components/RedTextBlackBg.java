package components;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

public class RedTextBlackBg extends Exhibit{

	public Label title;
	public Label label;
	public ImageView reaper;
	public ImageView cooltext;
	public ImageView leftEye;
	public ImageView rightEye;
	public RedTextBlackBg(int index) {
		super(index, "Red Text on Black Background", "So edgy");
		// TODO Auto-generated constructor stub
		title = new Label ();
		this.title.setLayoutX(5);
		this.title.setLayoutY(5);
		this.title.setMinSize(this.width - 10, this.height * .2 - 10);
		this.title.setStyle("-fx-font-size: 20; -fx-font-weight: bold;-fx-background-color: black;"
				+ "-fx-text-fill: red;");
		label = new Label("   <\\3<\\3<\\3<\\3<\\3<\\3<\\3<\\3<\\3<\\3<\\3<\\3<\\3<\\3<\\3\r\n"
				+ "   There are cemeteries that are lonely,\r\n"
				+ "   the heart moving through a tunnel,\r\n"
				+ "   in it darkness, darkness, darkness,\r\n"
				+ "   like a shipwreck we die going into ourselves,\r\n"
				+ "   as though we were drowning inside our hearts,\r\n"
				+ "   as though we lived falling out of the skin into the soul.\r\n"
				+ "   <\\3<\\3<\\3<\\3<\\3<\\3<\\3<\\3<\\3<\\3<\\3<\\3<\\3<\\3<\\3"
				+ "	  \r\n\r\n\r\n\t\tHosted on LiveJournal (2001)");
		this.label.setMinSize(this.width - 10, this.height * .8 + 5);
		this.label.setLayoutX(5);
		this.label.setLayoutY( this.height * .2 - 10);
		this.label.setStyle("-fx-font-size: 16; -fx-background-image: url(\"/assets/goth/sparkledust.gif\");"
				+ "-fx-text-fill: red;");
		this.reaper = new ImageView(new Image("/assets/goth/reaper.jpg"));
		this.reaper.setFitWidth(this.width * .3);
		this.reaper.setFitHeight(this.height * .66);
		this.reaper.setLayoutX(this.width * .66);
		this.reaper.setLayoutY(this.height * .2);
		this.leftEye = new ImageView(new Image("/assets/goth/glowing_eye.gif"));
		this.leftEye.setFitWidth(20);
		this.leftEye.setFitHeight(20);
		this.leftEye.setLayoutX(this.width * .75);
		this.leftEye.setLayoutY(this.height * .48);
		this.leftEye.setStyle("border-radius: 10px;");
		this.leftEye.setVisible(false);
		this.rightEye = new ImageView(new Image("/assets/goth/glowing_eye.gif"));
		this.rightEye.setFitWidth(20);
		this.rightEye.setFitHeight(20);
		this.rightEye.setLayoutX(this.width * .84);
		this.rightEye.setLayoutY(this.height * .48);
		this.rightEye.setVisible(false);
		this.rightEye.setStyle("border-radius: 10px;");
		this.cooltext = new ImageView(new Image("/assets/goth/cooltext420046471770038.gif"));
		this.cooltext.setFitWidth(this.width - 10);
		this.cooltext.setFitHeight(this.height * .2);
		this.cooltext.setLayoutX(10);
		this.cooltext.setLayoutY(10);
		this.getChildren().addAll(title, label, reaper, cooltext, leftEye, rightEye);
		
		EventHandler<MouseEvent> mouseEvent = new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				eventUpdate();
			}
		};
		EventHandler<MouseEvent> mouseEvent2 = new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				eventUpdate2();
			}
		};
		this.setOnMouseEntered(mouseEvent);
		this.setOnMouseExited(mouseEvent2);
	}
	
	public void eventUpdate() {
		this.rightEye.setVisible(true);
		this.leftEye.setVisible(true);
		
	}
	public void eventUpdate2() {
		this.rightEye.setVisible(false);
		this.leftEye.setVisible(false);
		
	}
}
