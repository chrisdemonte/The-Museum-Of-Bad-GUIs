package components;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

public class CNNisSlow extends Exhibit{

	public ImageView imageView;
	public boolean played;
	public CNNisSlow(int index) {
		super(index, "CNN is SLow", "You better believe it");
		// TODO Auto-generated constructor stub
		imageView = new ImageView(new Image("/assets/cnn/cnn_0.png"));
		imageView.setFitWidth(this.width - 10);
		imageView.setFitHeight(this.height - 10);
		imageView.setLayoutX(5);
		imageView.setLayoutY(5);
		imageView.setVisible(false);
		played = false;
		
		this.getChildren().add(imageView);
		
		EventHandler<MouseEvent> mouseEvent = new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				eventUpdate();
				
			}
			
		};
		this.setOnMouseEntered(mouseEvent);
	}
	
	public void eventUpdate() {

		if (played == false) {
			imageView.setVisible(true);
			played = true;
		    Timeline timeline = new Timeline();
		        
		    timeline.getKeyFrames().addAll(
		                    new KeyFrame(Duration.ZERO), // set start position at 0
		                    new KeyFrame(new Duration(1700),
		                    new KeyValue(imageView.imageProperty(), new Image("/assets/cnn/cnn_1.png"))),
		                    new KeyFrame(new Duration(1850),
				            new KeyValue(imageView.imageProperty(), new Image("/assets/cnn/cnn_2.png"))),
		                    new KeyFrame(new Duration(2250),
				            new KeyValue(imageView.imageProperty(), new Image("/assets/cnn/cnn_3.png"))),
		                    new KeyFrame(new Duration(3500),
				            new KeyValue(imageView.imageProperty(), new Image("/assets/cnn/cnn_4.png"))),
				            new KeyFrame(new Duration(4250),
						    new KeyValue(imageView.imageProperty(), new Image("/assets/cnn/cnn_5.png"))),
				            new KeyFrame(new Duration(4850),
						    new KeyValue(imageView.imageProperty(), new Image("/assets/cnn/cnn_6.png"))),
				            new KeyFrame(new Duration(6850),
						    new KeyValue(imageView.imageProperty(), new Image("/assets/cnn/cnn_7.png"))),
				            new KeyFrame(new Duration(9850),
						    new KeyValue(imageView.imageProperty(), new Image("/assets/cnn/cnn_8.png"))));
		    
		        // play 40s of animation
		    timeline.play();
		}
		
	}
}
