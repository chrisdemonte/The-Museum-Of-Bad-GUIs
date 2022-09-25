package components;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class LingHallOfFame extends Exhibit{
	
	public ImageView imageView;
	public LingHallOfFame(int index) {
		super(index, "Ling's Auto Rental", "Obviously the Best");
		// TODO Auto-generated constructor stub
		imageView = new ImageView(new Image("/assets/ling/ling_0.png"));
		imageView.setFitWidth(this.width - 10);
		imageView.setFitHeight(this.height - 10);
		imageView.setLayoutX(5);
		imageView.setLayoutY(5);
		//imageView.setVisible(false);
		eventUpdate();
		
		this.getChildren().add(imageView);
	}
	
	public void eventUpdate() {

		    Timeline timeline = new Timeline();
		        
		    timeline.getKeyFrames().addAll(
		                    new KeyFrame(Duration.ZERO,
		                    new KeyValue(imageView.imageProperty(), new Image("/assets/ling/ling_0.png"))),
		                    new KeyFrame(new Duration(333),
				            new KeyValue(imageView.imageProperty(), new Image("/assets/ling/ling_1.png"))),
		                    new KeyFrame(new Duration(666),
				            new KeyValue(imageView.imageProperty(), new Image("/assets/ling/ling_2.png"))),
		                    new KeyFrame(new Duration(999),
				            new KeyValue(imageView.imageProperty(), new Image("/assets/ling/ling_3.png"))),
				            new KeyFrame(new Duration(1333)));
		    
		        // play 40s of animation
		    timeline.setCycleCount(Animation.INDEFINITE);
		    timeline.play();
		
	}
}
